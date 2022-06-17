package com.example.hellomessagingapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")

public  class HelloRestController {

        // curl localhost:8080/hello -w "\n"
        @RequestMapping(value = {"", "/"})
        public String sayHello() {

                return "Hello From Bridgelabz!!!";
        }
}