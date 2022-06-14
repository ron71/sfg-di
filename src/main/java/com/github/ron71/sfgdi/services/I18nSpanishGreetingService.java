package com.github.ron71.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nGreetingService")
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String getGreetings() {
        return "Hola Mondor - ES";
    }
}
