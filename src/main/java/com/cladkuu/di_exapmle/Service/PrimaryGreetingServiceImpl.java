package com.cladkuu.di_exapmle.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
//@Service
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String SayHello() {
        return "Hello World - Primary";
    }
}
