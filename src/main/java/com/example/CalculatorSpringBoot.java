package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan(basePackages = { "com.example" })
public class CalculatorSpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(CalculatorSpringBoot.class, args);
    }
}
