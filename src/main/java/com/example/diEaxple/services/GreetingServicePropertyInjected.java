package com.example.diEaxple.services;


import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Friends dont let friends do property injection!";
    }
}
