package com.github.ron71.sfgdi.controllers;

import com.github.ron71.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreetings() {
        System.out.println(constructorInjectedController.getGreetings());
    }
}