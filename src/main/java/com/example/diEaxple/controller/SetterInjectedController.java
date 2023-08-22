package com.example.diEaxple.controller;

import com.example.diEaxple.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
       return greetingService.sayGreeting();
    }
}
