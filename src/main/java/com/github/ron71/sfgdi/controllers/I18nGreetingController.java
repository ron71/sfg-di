package com.github.ron71.sfgdi.controllers;

import com.github.ron71.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nGreetingController {
    private final GreetingService greetingService;

    public I18nGreetingController(@Qualifier("i18nGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetings(){
        return greetingService.getGreetings();
    }
}
