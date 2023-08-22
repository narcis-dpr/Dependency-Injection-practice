package com.example.diEaxple.services.i18n;

import com.example.diEaxple.controller.Myi18NController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("EN")
@SpringBootTest
class EnglishGreetingServiceTest {

    @Autowired
    Myi18NController i18NService;
    @Test
    void sayGreeting() {
        System.out.println(i18NService.sayHello());
    }
}