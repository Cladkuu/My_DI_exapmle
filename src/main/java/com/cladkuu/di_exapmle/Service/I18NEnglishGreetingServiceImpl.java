package com.cladkuu.di_exapmle.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"default", "EN"})
@Service("i18nService")
public class I18NEnglishGreetingServiceImpl implements GreetingService {
    @Override
    public String SayHello() {
        return "Hello World - English";
    }
}
