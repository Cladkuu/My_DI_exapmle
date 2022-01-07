package com.cladkuu.di_exapmle.Service;

import com.cladkuu.di_exapmle.Repository.EnglishGreetingRepositiry;
import com.cladkuu.di_exapmle.Repository.EnglishGreetingRepositiryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*@Profile({"default", "EN"})
@Service("i18nService")*/
public class I18NEnglishGreetingServiceImpl implements GreetingService {

    private final EnglishGreetingRepositiry englishGreetingRepositiry;

    public I18NEnglishGreetingServiceImpl(EnglishGreetingRepositiry englishGreetingRepositiry) {
        this.englishGreetingRepositiry = englishGreetingRepositiry;
    }

    @Override
    public String SayHello() {
        return englishGreetingRepositiry.SayGreeting();
    }


}
