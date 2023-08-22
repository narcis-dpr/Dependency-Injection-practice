package com.example.diEaxple.controller;

import com.example.diEaxple.services.GreetingService;
import com.example.diEaxple.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("i am in controller");
        return greetingService.sayGreeting();
    }
}
