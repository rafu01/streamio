package com.app.streamio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class SocketController {
    @GetMapping("/")
    public String redirectToIndex() {
        System.out.println("here");
        return "index";
    }
}