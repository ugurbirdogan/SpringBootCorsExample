package com.example.springbootcorsexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {

    @GetMapping("/test3")
    public String test3(){
        return "test3";
    }

    @GetMapping("/test4")
    public String test4(){
        return "test4";
    }

}
