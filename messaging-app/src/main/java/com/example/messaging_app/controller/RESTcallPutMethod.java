package com.example.messaging_app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class RESTcallPutMethod {

    @PutMapping("/put/{first_name}")
    public String sayHelloPut(@PathVariable String first_name, @RequestParam(value = "last_name") String last_name) {
        return "Hello " + first_name + " " + last_name + " from BridgeLabz!";
    }
}
