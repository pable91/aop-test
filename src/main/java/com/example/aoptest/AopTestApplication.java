package com.example.aoptest;

import com.example.aoptest.test.LogPrinter;
import com.example.aoptest.test.concreateProxy_v2.config.ConcreteConfig;
import com.example.aoptest.test.interfaceProxy_v1.config.InterfaceConfig;
import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@Import(InterfaceConfig.class)
@Import(ConcreteConfig.class)
public class AopTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopTestApplication.class, args);
    }

    @Bean
    LogPrinter logPrinter() {
        return new LogPrinter();
    }
}
