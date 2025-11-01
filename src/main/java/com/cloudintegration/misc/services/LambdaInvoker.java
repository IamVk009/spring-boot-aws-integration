package com.cloudintegration.misc.services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LambdaInvoker implements CommandLineRunner {

    private final LambdaService lambdaService;

    public LambdaInvoker(LambdaService lambdaService) {
        this.lambdaService = lambdaService;
    }

    @Override
    public void run(String... args) {
        String payload = "{ \"name\": \"SpringBootUser\" }"; // sample input
        String response = lambdaService.invokeLambda("my-lambda-function", payload);
        System.out.println("Lambda response: " + response);
    }
}
