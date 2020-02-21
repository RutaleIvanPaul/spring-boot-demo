package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoRestController {

    @GetMapping(value = "/hello")
    public String helloRest(){
        return "Hello Rest";
    }
}
