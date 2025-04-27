package com.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.bank")
public class BankManagementSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(BankManagementSystemApplication.class, args);
    }
}
