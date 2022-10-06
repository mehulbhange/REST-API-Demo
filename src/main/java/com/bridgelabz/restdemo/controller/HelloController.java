package com.bridgelabz.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //get request mapping
    @GetMapping("/hello")
    public String hello(){
        return "Hello from Bridgelabz";
    }

    //get request mapping with query parameter
    @GetMapping("/helloParam")
    public String hello(@RequestParam String name){
        return "Hello "+ name +" from Bridgelabz";
    }

}
