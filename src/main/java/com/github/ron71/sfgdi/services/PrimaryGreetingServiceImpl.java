package com.github.ron71.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary    // This will ensure that Bean Factory will return the object of this Service whenever a conflicts occur.
@Service
public class PrimaryGreetingServiceImpl implements GreetingService{
    @Override
    public String getGreetings() {
        return "Hi there - PRIMARY BEAN!";
    }
}
