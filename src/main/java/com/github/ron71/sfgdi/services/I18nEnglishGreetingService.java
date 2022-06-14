package com.github.ron71.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nGreetingService")
public class I18nEnglishGreetingService  implements GreetingService{
    @Override
    public String getGreetings() {
        return "Hello World - EN";
    }
}
