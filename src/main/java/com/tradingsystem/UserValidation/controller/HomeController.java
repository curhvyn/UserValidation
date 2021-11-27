package com.tradingsystem.UserValidation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String sayHello(){
        return "Hello From Home AController";
    }
}
