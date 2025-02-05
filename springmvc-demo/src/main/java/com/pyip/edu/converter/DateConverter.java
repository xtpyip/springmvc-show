package com.pyip.edu.converter;



import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
        @Override
        public Date convert(String source) {
            // 完成字符串向日期的转换
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

            try {
                Date parse = simpleDateFormat.parse(source);
                return parse;
            } catch (ParseException e) {
                e.printStackTrace();
            }

            return null;
        }
    }