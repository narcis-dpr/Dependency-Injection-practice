package com.example.diEaxple.controller;

import com.example.diEaxple.services.GreetingServiceImpl;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setup(){
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }
    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}