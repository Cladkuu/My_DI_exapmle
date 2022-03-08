package com.cladkuu.di_exapmle.Controllers;

import com.cladkuu.di_exapmle.Service.GreetingService;

@org.springframework.stereotype.Controller
public class Controller {

    private final GreetingService greetingService;

    public Controller(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String Hey(){
        return greetingService.SayHello();
    }
}
