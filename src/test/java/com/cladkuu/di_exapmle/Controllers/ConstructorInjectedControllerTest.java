package com.cladkuu.di_exapmle.Controllers;

import com.cladkuu.di_exapmle.Service.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new PropertyGreetingServiceImpl());

    }

    @Test
    void say() {
        System.out.println(controller.say());

    }
}