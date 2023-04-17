package com.example.aoptest.config;

import com.example.aoptest.test.*;
import com.example.aoptest.test.proxy.ControllerProxy;
import com.example.aoptest.test.proxy.RepositoryProxy;
import com.example.aoptest.test.proxy.ServiceProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public ControllerInterface testController1(LogPrinter logPrinter) {
        ControllerImpl testController = new ControllerImpl(testService1(logPrinter));
        ControllerProxy controllerProxy = new ControllerProxy(testController, logPrinter);
        return controllerProxy;
    }

    @Bean
    public ServiceInterface testService1(LogPrinter logPrinter) {
        ServiceImpl testService = new ServiceImpl(testRepository1(logPrinter));
        ServiceProxy serviceProxy = new ServiceProxy(testService, logPrinter);
        return serviceProxy;
    }

    @Bean
    public RepositoryInterface testRepository1(LogPrinter logPrinter) {
        RepositoryImpl testRepository = new RepositoryImpl();
        RepositoryProxy repositoryProxy = new RepositoryProxy(testRepository, logPrinter);
        return repositoryProxy;
    }

    @Bean
    public LogPrinter logPrinter() {
        return new LogPrinter();
    }
}
