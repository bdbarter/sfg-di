package com.example.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by bb on 6/5/2021.
 */
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello World!!!");

        return "Hi Folks!";
    }
}
