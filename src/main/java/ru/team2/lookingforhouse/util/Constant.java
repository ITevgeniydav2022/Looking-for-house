package ru.team2.lookingforhouse.util;

import java.util.HashSet;

public class Constant {

   public final static String DOG_BUTTON = "DOG_BUTTON";
   public final static String CAT_BUTTON = "CAT_BUTTON";
   public final static String ADDRESS_DOG_BUTTON = "ADDRESS_DOG_BUTTON";
   public final static String ADDRESS_CAT_BUTTON = "ADDRESS_CAT_BUTTON";
   public final static String DRIVING_DIRECTIONS_DOG_BUTTON = "DRIVING_DIRECTIONS_DOG_BUTTON";
   public final static String DRIVING_DIRECTIONS_CAT_BUTTON = "DRIVING_DIRECTIONS_CAT_BUTTON";
   public final static String SAFETY_PRECAUTIONS_DOG_BUTTON = "SAFETY_PRECAUTIONS_DOG_BUTTON";
   public final static String SAFETY_PRECAUTIONS_CAT_BUTTON = "SAFETY_PRECAUTIONS_CAT_BUTTON";
   public final static String CALL_VOLUNTEER_BUTTON = "CALL_VOLUNTEER_BUTTON";
   public final static String INFO_DOG_BUTTON = "INFO_DOG_BUTTON";
   public final static String INFO_CAT_BUTTON = "INFO_CAT_BUTTON";
   public final static String TO_ADOPT_DOG_BUTTON = "TO_ADOPT_DOG_BUTTON";
   public final static String TO_ADOPT_CAT_BUTTON = "TO_ADOPT_CAT_BUTTON";
   public final static String SUBMIT_REPORT_BUTTON = "SUBMIT_REPORT_BUTTON";
   public final static String RULES_DOG_BUTTON = "RULES_DOG_BUTTON";
   public final static String RULES_CAT_BUTTON = "RULES_CAT_BUTTON";
   public final static String DOC_DOG_BUTTON = "DOC_DOG_BUTTON";
   public final static String DOC_CAT_BUTTON = "DOC_CAT_BUTTON";
   public final static String TRANSPORTATION_DOG_BUTTON = "TRANSPORTATION_DOG_BUTTON";
   public final static String TRANSPORTATION_CAT_BUTTON = "TRANSPORTATION_CAT_BUTTON";
   public final static String RECOMMENDATION_PUPPY_BUTTON = "RECOMMENDATION_PUPPY_BUTTON";
   public final static String RECOMMENDATION_KITTY_BUTTON = "RECOMMENDATION_KITTY_BUTTON";
   public final static String RECOMMENDATION_CAT_BUTTON = "RECOMMENDATION_CAT_BUTTON";
   public final static String RECOMMENDATION_DOG_BUTTON = "RECOMMENDATION_DOG_BUTTON";
   public final static String REC_HANDICAPPED_DOG_BUTTON = "REC_HANDICAPPED_DOG_BUTTON";
   public final static String REC_HANDICAPPED_CAT_BUTTON = "REC_HANDICAPPED_CAT_BUTTON";
   public final static String ADVICES_CYNOLOGISTS_BUTTON = "ADVICES_CYNOLOGISTS_BUTTON";
   public final static String CYNOLOGISTS_BUTTON = "CYNOLOGISTS_BUTTON";
   public final static String VET_CENTER_BUTTON = "VET_CENTER_BUTTON";
   public final static String REASONS_FOR_REFUSAL_BUTTON = "REASONS_FOR_REFUSAL_BUTTON";
   public final static String SAVE_CONTACT_BUTTON = "SAVE_CONTACT_BUTTON";

   public static final HashSet<Long> REQUEST_GET_REPLY_FROM_USER = new HashSet<>();
   public static final String MESSAGE_THANKS_FOR_REPLY = "Благодарим за отчет, волонтер проверит его и " +
           "если что-то будет не так, даст Вам обратную связь";
   public static final String MESSAGE_TEXT_NOT_LIKE_EXAMPLE = "Текст отчета не соответствует шаблону, пожалуйста заполните текст отчета по образцу";
   public static final String REPORT_EXAMPLE = "Образец отчета";
   public static final String SEND_REPORT = "Отправить отчет";
   public static final String MESSAGE_TEXT_NO_REPORT_TEXT = "Вы отправили только фото, необходимо добавить подпись к фото с текстом отчета по шаблону";
   public static final String MESSAGE_TEXT_NO_COMMAND = "Нет такой команды";
   public static final String MESSAGE_TEXT_SEND_CONTACT_SUCCESS = "Данные успешно отправлены";
   public static final String REGEX_MESSAGE = "(Рацион:)(\\s)(\\W+)(;)\n" +
           "(Самочувствие:)(\\s)(\\W+)(;)\n" +
           "(Поведение:)(\\s)(\\W+)(;)";
}
