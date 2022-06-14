package com.github.ron71.sfgdi.controllers;

import com.github.ron71.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
         setterInjectedController = new SetterInjectedController();
         setterInjectedController.setGreetingService(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreetings() {
        System.out.println(setterInjectedController.getGreetings());
    }
}