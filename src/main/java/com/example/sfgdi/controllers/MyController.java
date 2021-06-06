package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by bb on 6/5/2021.
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
