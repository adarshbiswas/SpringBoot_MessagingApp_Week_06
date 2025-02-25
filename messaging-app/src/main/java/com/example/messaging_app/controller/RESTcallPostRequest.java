package com.example.messaging_app.controller;

import com.example.messaging_app.dto.FullName;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class RESTcallPostRequest {

    @PostMapping("/post")
    public String postHello(@RequestBody FullName name) {
        return "Hello " + name.getFirst_name() + " " + name.getLast_name() + " from BridgeLabz!";
    }
}
