package com.cladkuu.di_exapmle.Controllers;

import com.cladkuu.di_exapmle.Service.GreetingService;
import com.cladkuu.di_exapmle.datasource.DBMock;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    private final GreetingService greetingService;
    private final DBMock dbMock;

    public Controller(GreetingService greetingService, DBMock dbMock) {
        this.greetingService = greetingService;
        this.dbMock = dbMock;
    }

    public String Hey(){
        return greetingService.SayHello();
    }


    public String sayName(){
        return dbMock.getPassword();
    }
}
