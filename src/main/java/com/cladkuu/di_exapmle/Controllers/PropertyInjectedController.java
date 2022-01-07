package com.cladkuu.di_exapmle.Controllers;

import com.cladkuu.di_exapmle.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("SSSS")
    @Autowired
    public GreetingService greetingService;

    public String say(){
        return greetingService.SayHello();
    }


}
