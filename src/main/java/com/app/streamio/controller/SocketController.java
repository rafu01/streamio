package com.app.streamio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SocketController {
    @GetMapping("/home")
    public String redirectToIndex() {
        System.out.println("here");
        return "index";
    }
}