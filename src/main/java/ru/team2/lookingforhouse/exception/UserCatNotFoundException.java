package ru.team2.lookingforhouse.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * Класс исключения UserCatNotFoundException.
 * @author Одокиенко Екатерина
 */

/** Механизм для обработки базовых ошибок для REST API с кодом ответа "404 - Не найден". */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserCatNotFoundException extends RuntimeException{
    public UserCatNotFoundException() {
        super("Мы не нашли такого пользователя!");
    }
}
