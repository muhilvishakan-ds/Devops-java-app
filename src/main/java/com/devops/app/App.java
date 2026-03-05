package com.devops.app;

public class App {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   DevOps Java App - Maven Build        ");
        System.out.println("========================================");
        GreetingService service = new GreetingService();
        System.out.println(service.greet("DevOps Engineer"));
        System.out.println(service.getEnvironmentInfo());
        System.out.println("Build successful! Ready for CI/CD!");
        System.out.println("========================================");
    }
}
