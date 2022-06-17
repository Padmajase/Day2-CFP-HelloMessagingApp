package com.example.hellomessagingapp.controller;

import com.example.hellomessagingapp.model.User;
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

        // curl localhost:8080/hello/param/padmaja -w "\n"
        @GetMapping("/param/{name}")
        public String sayHelloParam(@PathVariable String name) {
                return "Hello" + name + "!";
        }

        // curl -X POST -H "Content-Type: application/json"
        // -d '{"firstName" : "Padmaja", "lastName" : "Pawar"}'
        // curl localhost:8080/hello/post -w "\n"
        @PostMapping("/post")
        public String sayHello(@RequestBody User user) {
                return "Hello" + user.getFirstName() + user.getLastName() + "!";
        }


}