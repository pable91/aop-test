package com.example.aoptest.config;

import com.example.aoptest.test.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public TestController testController1(LogPrinter logPrinter) {
        return new TestControllerImpl(testService1(logPrinter), logPrinter);
    }

    @Bean
    public TestService testService1(LogPrinter logPrinter) {
        return new TestServiceImpl(testRepository1(logPrinter), logPrinter);
    }

    @Bean
    public TestRepository testRepository1(LogPrinter logPrinter) {
        return new TestRepositoryImpl(logPrinter);
    }
}
