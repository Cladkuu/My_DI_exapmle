package com.cladkuu.di_exapmle.Controllers;

import com.cladkuu.di_exapmle.Service.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new PropertyGreetingServiceImpl();
    }

    @Test
    void sayHello() {
        System.out.println(controller.say());
    }
}