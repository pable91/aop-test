package com.example.aoptest;

import com.example.aoptest.test.LogPrinter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopTestApplication.class, args);
    }

    @Bean
    public LogPrinter logPrinter() {
        return new LogPrinter();
    }
}
