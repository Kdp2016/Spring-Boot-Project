package com.kalon.springbootshowcase.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String Welcome(){
        return "Welcome to CodeStar!!!";
    }
}
