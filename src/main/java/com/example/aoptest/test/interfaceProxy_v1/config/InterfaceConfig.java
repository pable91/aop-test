package com.example.aoptest.test.interfaceProxy_v1.config;

import com.example.aoptest.test.*;
import com.example.aoptest.test.interfaceProxy_v1.*;
import com.example.aoptest.test.interfaceProxy_v1.proxy.interfaceProxy.ControllerProxy;
import com.example.aoptest.test.interfaceProxy_v1.proxy.interfaceProxy.RepositoryProxy;
import com.example.aoptest.test.interfaceProxy_v1.proxy.interfaceProxy.ServiceProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InterfaceConfig {

    @Bean
    public ControllerInterface controllerInterface(LogPrinter logPrinter) {
        ControllerImpl testController = new ControllerImpl(serviceInterface(logPrinter));
        ControllerProxy controllerProxy = new ControllerProxy(testController, logPrinter);
        return controllerProxy;
    }

    @Bean
    public ServiceInterface serviceInterface(LogPrinter logPrinter) {
        ServiceImpl testService = new ServiceImpl(repositoryInterface(logPrinter));
        ServiceProxy serviceProxy = new ServiceProxy(testService, logPrinter);
        return serviceProxy;
    }

    @Bean
    public RepositoryInterface repositoryInterface(LogPrinter logPrinter) {
        RepositoryImpl testRepository = new RepositoryImpl();
        RepositoryProxy repositoryProxy = new RepositoryProxy(testRepository, logPrinter);
        return repositoryProxy;
    }

//    @Bean
//    public LogPrinter logPrinter() {
//        return new LogPrinter();
//    }
}
