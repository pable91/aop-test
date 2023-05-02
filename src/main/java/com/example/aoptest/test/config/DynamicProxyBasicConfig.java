package com.example.aoptest.test.config;

import com.example.aoptest.test.LogPrinter;
import com.example.aoptest.test.app.JDK_proxy_v3.LogPrinterBasicHandler;
import com.example.aoptest.test.app.interfaceProxy_v1.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Proxy;

@Configuration
public class DynamicProxyBasicConfig {
    @Bean
    public ControllerInterface controllerInterface(LogPrinter logPrinter) {
        ControllerInterface controllerInterface = new ControllerImpl(serviceInterface(logPrinter));

        ControllerInterface proxy = (ControllerInterface) Proxy.newProxyInstance(
                ControllerInterface.class.getClassLoader(),
                new Class[]{ControllerInterface.class},
                new LogPrinterBasicHandler(controllerInterface, logPrinter)
        );
        return proxy;
    }

    @Bean
    public ServiceInterface serviceInterface(LogPrinter logPrinter) {
        ServiceInterface serviceInterface = new ServiceImpl(repositoryInterface(logPrinter));

        ServiceInterface proxy = (ServiceInterface) Proxy.newProxyInstance(
                ServiceInterface.class.getClassLoader(),
                new Class[]{ServiceInterface.class},
                new LogPrinterBasicHandler(serviceInterface, logPrinter)
        );
        return proxy;
    }

    @Bean
    public RepositoryInterface repositoryInterface(LogPrinter logPrinter) {
        RepositoryInterface repositoryInterface = new RepositoryImpl();

        RepositoryInterface proxy = (RepositoryInterface) Proxy.newProxyInstance(
                RepositoryInterface.class.getClassLoader(),
                new Class[]{RepositoryInterface.class},
                new LogPrinterBasicHandler(repositoryInterface, logPrinter)
        );
        return proxy;
    }
}
