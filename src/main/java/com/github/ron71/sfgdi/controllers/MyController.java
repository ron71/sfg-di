package com.github.ron71.sfgdi.controllers;

import com.github.ron71.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetings(){
        return greetingService.getGreetings();
    }
}
