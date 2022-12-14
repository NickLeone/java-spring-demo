package com.example.javaspringdemo.service;

import com.example.javaspringdemo.domain.User;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@AllArgsConstructor
@Service
public class UserService {

//    private final UserRepository userRepository;

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();

        int x = 10;
        while(x > 0) {
            User user = new User();
            user.setFirstName("First");
            user.setLastName("Last " + x);

            users.add(user);
            x--;
        }

        return users;
    }

}
