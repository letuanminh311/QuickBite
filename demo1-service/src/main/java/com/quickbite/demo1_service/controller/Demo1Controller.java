package com.quickbite.demo1_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;
@RestController
public class Demo1Controller {
    @Value("${message}")
    private String message;
    @GetMapping("/message")
    public String getMessage() {
        return message;
    }
    @GetMapping("/api/demo")
    public Map<String, Object> getDemoData() {
        Map<String, Object> response = new HashMap<>();
        response.put("service", "demo1-service");
        response.put("message", "This is a sample REST API from Demo1 Service!");
        response.put("timestamp", System.currentTimeMillis());
        return response;
    }
}
