package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;

/**
 * Created by bb on 6/5/2021.
 */
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
