package com.cladkuu.di_exapmle.Config;

import com.cladkuu.di_exapmle.Repository.EnglishGreetingRepositiry;
import com.cladkuu.di_exapmle.Repository.EnglishGreetingRepositiryImpl;
import com.cladkuu.di_exapmle.Service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingConfig {

    @Profile("ES")
    @Bean
    I18NSpanishGreetingServiceImpl i18NSpanishGreetingService(){
        return new I18NSpanishGreetingServiceImpl();
    }

    @Bean
    EnglishGreetingRepositiry englishGreetingRepositiryImpl(){
        return new EnglishGreetingRepositiryImpl();
    }

    @Profile({"default", "EN"})
    @Bean("i18nService")
    I18NEnglishGreetingServiceImpl i18NEnglishGreetingService(EnglishGreetingRepositiry englishGreetingRepositiryImpl){
        return new I18NEnglishGreetingServiceImpl(englishGreetingRepositiryImpl);
    }

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

    @Primary
    @Bean
    PrimaryGreetingServiceImpl primaryGreetingServiceImpl(){
        return new PrimaryGreetingServiceImpl();
    }
}
