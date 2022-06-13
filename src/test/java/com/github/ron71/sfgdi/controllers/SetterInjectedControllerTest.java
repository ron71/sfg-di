package com.github.ron71.sfgdi.controllers;

import com.github.ron71.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
         setterInjectedController = new SetterInjectedController();
         setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreetings() {
        System.out.println(setterInjectedController.getGreetings());
    }
}