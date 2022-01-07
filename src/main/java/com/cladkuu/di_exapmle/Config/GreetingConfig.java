package com.cladkuu.di_exapmle.Config;

import com.cladkuu.di_exapmle.Service.ConstructorGreetingServiceImpl;
import com.cladkuu.di_exapmle.Service.PropertyGreetingServiceImpl;
import com.cladkuu.di_exapmle.Service.SetterGreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingConfig {

    @Bean
    ConstructorGreetingServiceImpl constructorGreetingServiceImpl(){
        return new ConstructorGreetingServiceImpl();
    }

    @Bean(value = "SSSS")
    PropertyGreetingServiceImpl propertyGreetingService(){
        return new PropertyGreetingServiceImpl();
    }

    @Bean
    SetterGreetingServiceImpl setterGreetingServiceImpl() {
        return new SetterGreetingServiceImpl();
    }
}
