package com.example.messaging_app.rest_request;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class RESTcallQueryParameter {

    //    Rest call using query parameter
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + " from BridgeLabz!!";
    }

}
