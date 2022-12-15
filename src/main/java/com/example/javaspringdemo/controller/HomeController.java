package com.example.javaspringdemo.controller;

import com.example.javaspringdemo.utils.DateHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HomeController {

    @RequestMapping ("/")
    public String home(Model model) {
        LocalDateTime currentDateTime = DateHelper.getCurrentDate();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy h:m a");
        model.addAttribute("currentDateTime", currentDateTime.format(formatter));

        return "home";
    }
}
