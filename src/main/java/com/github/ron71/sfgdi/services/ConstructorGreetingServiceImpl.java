package com.github.ron71.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String getGreetings() {
        return "Hi There - Constructor";
    }
}
