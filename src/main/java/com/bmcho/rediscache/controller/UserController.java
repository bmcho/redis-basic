package com.bmcho.rediscache.controller;

import com.bmcho.rediscache.domain.entity.RedisHashUser;
import com.bmcho.rediscache.domain.entity.User;
import com.bmcho.rediscache.service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser3(id);
    }

    @GetMapping("/redishash-users/{id}")
    public RedisHashUser getUser2(@PathVariable Long id) {
        return userService.getUser2(id);
    }

    @GetMapping("/")
    public Map<String, String> home(HttpSession session) {
        Integer visitCount = (Integer) session.getAttribute("visits");
        if (visitCount == null) {
            visitCount = 0;
        }
        session.setAttribute("visits", ++visitCount);
        return Map.of("session id", session.getId(), "visits", visitCount.toString());
    }
}