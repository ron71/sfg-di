package com.github.ron71.sfgdi.controllers;

import com.github.ron71.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    GreetingService greetingService;

    public String getGreetings(){
        return greetingService.getGreetings();
    }

}
