package com.example.javaspringdemo.utils;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DateHelper {

    public static LocalDateTime getCurrentDate() {
        return LocalDateTime.now();
    }
}
