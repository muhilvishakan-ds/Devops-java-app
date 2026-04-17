package com.devops.app;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class DevOpsController {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, DevOps Engineer!");
        response.put("status", "running");
        response.put("java", System.getProperty("java.version"));
        response.put("os", System.getProperty("os.name"));
        return response;
    }

    @GetMapping("/greet/{name}")
    public Map<String, String> greet(@PathVariable String name) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, " + name + "! Welcome to DevOps.");
        response.put("version", "1.0.0");
        return response;
    }

    @GetMapping("/status")
    public Map<String, Object> status() {
        Map<String, Object> response = new HashMap<>();
        response.put("app", "DevOps Java App");
        response.put("version", "1.0.0");
        response.put("status", "UP");
        response.put("pipeline", List.of("Maven", "Jenkins", "Docker", "SonarQube", "GitHub"));
        return response;
    }
}
