package com.github.ron71.sfgdi.controllers;

import com.github.ron71.sfgdi.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetings(){
        return greetingService.getGreetings();
    }
}
