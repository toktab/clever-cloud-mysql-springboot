package dev.toktab.clevercloudmysqlspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/")
    public String getGreeting(){
        return "Publicly accessible URL";
    }
}
