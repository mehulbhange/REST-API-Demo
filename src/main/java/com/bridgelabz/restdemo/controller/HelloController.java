package com.bridgelabz.restdemo.controller;
import com.bridgelabz.restdemo.entity.Person;
import org.springframework.web.bind.annotation.*;

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

    //get request mapping with path variable
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello "+ name +" from Bridgelabz";
    }

    //post request mapping with request body
    @PostMapping("/hello")
    public String getFirstLastName(@RequestBody Person person){
        return "Hello "+ person.getFirstName() +" "+ person.getLastName() +" from Bridgelabz";
    }

    //put request mapping with path variable and query parameter
    @PutMapping("/hello/put/{firstName}")
    public String sayHelloWithPut(@RequestParam String lastName, @PathVariable String firstName){
        return "Hello "+ firstName +" "+ lastName +" from Bridgelabz";
    }

}
