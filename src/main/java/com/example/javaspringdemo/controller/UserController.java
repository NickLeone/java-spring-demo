package com.example.javaspringdemo.controller;

import com.example.javaspringdemo.domain.User;
import com.example.javaspringdemo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@AllArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public String users(Model model) {
        List<User> users = userService.getUsers();

        model.addAttribute("users", users);

        return "/users/list";
    }
}
