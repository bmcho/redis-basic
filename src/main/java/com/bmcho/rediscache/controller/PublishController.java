package com.bmcho.rediscache.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
public class PublishController {
    private final RedisTemplate<String, String> redisTemplate;

    @PostMapping("/events/users/deregister")
    void publishUserDeregisterEvent() {
        redisTemplate.convertAndSend("users:unregister", "500");
    }
}