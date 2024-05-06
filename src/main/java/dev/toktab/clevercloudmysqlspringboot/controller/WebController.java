package dev.toktab.clevercloudmysqlspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/users")
    public String usersPage() {
        return "forward:/index.html";
        // Forward to the static HTML file located in `src/main/resources/static/index.html`
    }
}
