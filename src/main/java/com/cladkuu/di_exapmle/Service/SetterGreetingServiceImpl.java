package com.cladkuu.di_exapmle.Service;

import org.springframework.stereotype.Service;

//@Service
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String SayHello() {
        return "Hello World - Setter";
    }
}
