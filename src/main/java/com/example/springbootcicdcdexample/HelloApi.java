package com.example.springbootcicdcdexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {
    @GetMapping("/hello")
    public String get() {
        return "Hello CD";
    }
}
