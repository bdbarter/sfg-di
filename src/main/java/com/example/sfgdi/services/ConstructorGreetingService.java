package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by bb on 6/5/2021.
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
