package com.example.bespin_maven_edu.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HomeRestController {

    @GetMapping("/hello")
    public String hello()
    {
        return "hello";
    }

    @GetMapping("/bye")
    public String bye(){
        return "bye";
    }
}
