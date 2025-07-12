package com.quickbite.api_gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
@RestController
public class GatewayController {
    @Value("${message}")
    private String message;
    @GetMapping("/message")
    public Mono<String> getMessage() {
        return Mono.just(message);
    }
}
