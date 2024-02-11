package com.ethiqque.springcourse.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @Value("${hello}")
    private String hello;

    @GetMapping("/hello")
    public String helloMethod(){
        System.out.println("hello " + this.hello);
        return "hello";
    }
}
