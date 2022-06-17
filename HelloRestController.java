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

        // curl localhost:8080/hello/?name=padmaja -w "\n"
        @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
        public String sayHello(@RequestParam(value = "name") String name) {
                return "Hello" + name + "From Bridgelabz!!!";
        }

}