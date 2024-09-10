package com.sirma.footballapi.utils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class DateParser {

    private static final String[] DATE_FORMATTERS = {
            "yyyy-MM-dd", "yyyy/MM/dd", "yyyyMMdd",
            "dd-MM-yyyy", "dd/MM/yyyy", "MMddyyyy", "M/d/yyyy",
            "MMM d, yyyy", "MMMM d, yyyy", "yyyy MMM d", "yyyy/MM/dd HH:mm:ss"
    };

    public static LocalDate parseDate(String date){
        for(String format : DATE_FORMATTERS){
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
                return  LocalDate.parse(date, formatter);
            } catch (DateTimeException e){
                continue;
            }
        }
        throw new DateTimeException(STR."Failed to parse the date: \{date}");
    }
}
