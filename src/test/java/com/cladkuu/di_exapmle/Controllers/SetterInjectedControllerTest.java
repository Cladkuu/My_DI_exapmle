package com.cladkuu.di_exapmle.Controllers;

import com.cladkuu.di_exapmle.Service.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();

        setterInjectedController.setGreetingService(new PropertyGreetingServiceImpl());
    }

    @Test
    void say() {
        System.out.println(setterInjectedController.say());
    }
}