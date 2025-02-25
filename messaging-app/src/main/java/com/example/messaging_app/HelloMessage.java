package com.example.messaging_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMessage {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz!!!";
    }
}
