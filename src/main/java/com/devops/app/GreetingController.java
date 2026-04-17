package com.devops.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    private final GreetingService greetingService = new GreetingService();

    @GetMapping("/")
    public String index(
            @RequestParam(name = "name", defaultValue = "DevOps Engineer") String name,
            Model model) {
        model.addAttribute("message", greetingService.greet(name));
        model.addAttribute("envInfo", greetingService.getEnvironmentInfo());
        model.addAttribute("name", name);
        return "index";
    }
}
