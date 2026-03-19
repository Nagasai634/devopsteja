package com.example.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {

    @GetMapping("/hello")
    public String greetings()
    {
        return "Hello from AWS!";
    }
}
