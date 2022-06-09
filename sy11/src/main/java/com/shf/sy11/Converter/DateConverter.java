package com.shf.sy11.Converter;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    private String datePattern = "yyyy-MM-dd";

    public Date convert(String score) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        try {
            return simpleDateFormat.parse(score);
        } catch (ParseException e) {
            return null;
        }
    }
}
