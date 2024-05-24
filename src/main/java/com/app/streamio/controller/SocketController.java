package com.app.streamio.controller;

import com.app.streamio.dto.HelloMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static com.app.streamio.utils.StaticConstants.INDEX_VIEW;

@Slf4j
@Controller
@RequiredArgsConstructor
public class SocketController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public String greet(HelloMessage helloMessage) {
        log.info("message received: {}",helloMessage);
        return "Received";
    }

    @GetMapping("/home")
    public String getHome(Model model) {
        model.addAttribute("message", "hello world");
        log.info("Here");
        return INDEX_VIEW;
    }
}
