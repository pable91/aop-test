package com.example.aoptest.config;

import com.example.aoptest.test.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public TestController testController1() {
        return new TestControllerImpl(testService1());
    }

    @Bean
    public TestService testService1() {
        return new TestServiceImpl(testRepository1());
    }

    @Bean
    public TestRepository testRepository1() {
        return new TestRepositoryImpl();
    }
}
