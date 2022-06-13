package com.github.ron71.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String getGreetings(){
        System.out.println("Hello world!");
        return "Hi!";
    }
}
