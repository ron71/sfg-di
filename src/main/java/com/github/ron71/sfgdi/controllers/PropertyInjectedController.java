package com.github.ron71.sfgdi.controllers;

import com.github.ron71.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String getGreetings(){
        return greetingService.getGreetings();
    }

}
