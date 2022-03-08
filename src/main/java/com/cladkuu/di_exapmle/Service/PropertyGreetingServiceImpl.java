package com.cladkuu.di_exapmle.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("SSSS")
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String SayHello() {
        return "Hello World - Property";
    }
}
