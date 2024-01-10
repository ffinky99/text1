package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class firstController {
    @GetMapping("/hi")
    public String niceToMeetYou(){
        return "greetings";
    }
}
