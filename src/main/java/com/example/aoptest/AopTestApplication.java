package com.example.aoptest;

import com.example.aoptest.test.config.DynamicProxyBasicConfig;
import com.example.aoptest.test.LogPrinter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication(scanBasePackages = "com.example.aoptest.test.app")
//@Import(InterfaceConfig.class)
//@Import(ConcreteConfig.class)
@Import(DynamicProxyBasicConfig.class)
public class AopTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopTestApplication.class, args);
    }

    @Bean
    LogPrinter logPrinter() {
        return new LogPrinter();
    }
}
