package com.example.diEaxple.services.i18n;

import com.example.diEaxple.controller.Myi18NController;
import com.example.diEaxple.services.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("ES")
@SpringBootTest
class SpanishGreetingServiceTest {

    @Autowired
    Myi18NController myi18NController;
    @Test
    void sayGreeting() {
        System.out.println(myi18NController.sayHello());
    }
}