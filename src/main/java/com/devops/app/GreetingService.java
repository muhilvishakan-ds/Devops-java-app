package com.devops.app;

public class GreetingService {
    public String greet(String name) {
        if (name == null || name.isBlank()) return "Hello, World!";
        return "Hello, " + name + "! Welcome to DevOps.";
    }
    public String getEnvironmentInfo() {
        return "Java Version : " + System.getProperty("java.version") + "\n" +
               "OS           : " + System.getProperty("os.name") + "\n" +
               "App Version  : 1.0.0";
    }
}
