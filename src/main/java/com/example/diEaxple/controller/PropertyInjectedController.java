package com.example.diEaxple.controller;

import com.example.diEaxple.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;
    public String sayHello() {
       return greetingService.sayGreeting();
    }
}
