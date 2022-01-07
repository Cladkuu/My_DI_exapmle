package com.cladkuu.di_exapmle.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18NSpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String SayHello() {
        return "Holla Munda - Spanish";
    }
}
