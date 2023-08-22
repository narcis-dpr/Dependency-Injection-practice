package com.example.diEaxple.services;

import org.springframework.stereotype.Service;

@Service("settingAGreeting")
public class GreetingServiceSetterInjection implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hey im setting a greeting!";
    }
}
