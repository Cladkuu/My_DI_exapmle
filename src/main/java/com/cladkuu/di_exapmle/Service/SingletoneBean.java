package com.cladkuu.di_exapmle.Service;


import org.springframework.stereotype.Component;

@Component
public class SingletoneBean {

    public SingletoneBean() {
        System.out.println("Creating Singletone Bean!");
    }

    public String getScope(){
        return "i'm Singletone Bean!";
    }
}
