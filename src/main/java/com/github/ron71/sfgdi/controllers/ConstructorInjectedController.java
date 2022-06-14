package com.github.ron71.sfgdi.controllers;

import com.github.ron71.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    //Here @AutoWired annotation is optional in Constructor Injected Dependency injection
    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetings(){
        return greetingService.getGreetings();
    }

}
