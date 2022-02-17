package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String blank(){
        return "200";
    }
    @GetMapping("/hello")
    public String hello(){
        return "<h1>Hello World</h1>";
    }

    @PostMapping("/details")
    public User details(@RequestBody User user){
        return user;
    }

}
