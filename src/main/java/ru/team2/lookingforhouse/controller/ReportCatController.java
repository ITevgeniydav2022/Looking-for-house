package ru.team2.lookingforhouse.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.team2.lookingforhouse.model.ReportCat;
import ru.team2.lookingforhouse.service.ReportCatService;
import ru.team2.lookingforhouse.service.TelegramBotUpdatesListener;

/**
 * Класс контроллера объекта "Отчет данных пользователя, интересующегося котом"
 *
 * @author Одокиенко Екатерина
 */

@Tag(name = "REPORT CAT", description = "API для объекта \"Отчет данных пользователя, интересующегося котом\"")
@RestController
@RequestMapping("report_cat")
public class ReportCatController {
    private final TelegramBotUpdatesListener telegramBotUpdatesListener;
    private final ReportCatService reportCatService;


    public ReportCatController(TelegramBotUpdatesListener telegramBotUpdatesListener, ReportCatService reportCatService) {
        this.telegramBotUpdatesListener = telegramBotUpdatesListener;
        this.reportCatService = reportCatService;
    }

    @Operation(summary = "Просмотр объекта \"Отчет о данных пользователя, интересующегося котом\" по айди",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Объект \"Отчет о данных пользователя, интересующегося котом\", найденный по айди",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = ReportCat.class)
                            )
                    ),
                    @ApiResponse(responseCode = "400",
                            description = "Объект \"Отчет о данных пользователя, интересующегося котом\" по данному id не найден!")
            }
    )
    @GetMapping("/{id}")
    public ReportCat downloadReport(@Parameter(description = "айди объекта \"Отчет о данных пользователя, интересующегося котом\"", example = "956120008L")
                                        @PathVariable Long id) {
        return this.reportCatService.findById(id);
    }

    @Operation(summary = "Просмотр фото по айди объекта \"Отчет о данных пользователя, интересующегося котом\"",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Фото, найденное по айди объекта \"Отчет о данных пользователя, интересующегося котом\""
            )
    )
    @GetMapping("/{id}/photo_from_db")
    public ResponseEntity<String> downloadPhotoFromDB(@Parameter(description = "айди объекта \"Отчет о данных пользователя, интересующегося котом\"", example = "956120008L")
                                                          @PathVariable Long id) {
        ReportCat report = this.reportCatService.findById(id);
        HttpHeaders headers = new HttpHeaders();
        final String fileType = "image/jpeg";
        headers.setContentType(MediaType.parseMediaType(fileType));
        headers.setContentLength(report.getPhotoId().length());
        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(report.getPhotoId());
    }

    @Operation(summary = "Отправить сообщение пользователю",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Сообщение определенному пользователю",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = ReportCat.class)
                            )
                    )
            }
    )
    @GetMapping("/message_to_person")
    public void sendMessageToPerson(@Parameter(description = "айди пользователя", example = "956120008L")
                                    @RequestParam Long id,
                                    @Parameter(description = "Ваше сообщение", example = "Приветствую вас, пурпурный человек!")
                                    @RequestParam String message) {
        this.telegramBotUpdatesListener.sendMessage(id, message);
    }
}

