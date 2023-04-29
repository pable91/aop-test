package com.example.aoptest.test.concreateProxy_v2.config;

import com.example.aoptest.test.LogPrinter;
import com.example.aoptest.test.concreateProxy_v2.ControllerImplV2;
import com.example.aoptest.test.concreateProxy_v2.RepositoryImplV2;
import com.example.aoptest.test.concreateProxy_v2.ServiceImplV2;
import com.example.aoptest.test.concreateProxy_v2.concreteProxy.ControllerProxyV2;
import com.example.aoptest.test.concreateProxy_v2.concreteProxy.RepositoryProxyV2;
import com.example.aoptest.test.concreateProxy_v2.concreteProxy.ServiceProxyV2;
import com.example.aoptest.test.interfaceProxy_v1.proxy.interfaceProxy.ControllerProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConcreteConfig {

    @Bean
    public ControllerImplV2 controllerImplV2(LogPrinter logPrinter) {
        ControllerImplV2 controller = new ControllerImplV2(serviceImplV2(logPrinter));
        ControllerProxyV2 controllerProxyV2 = new ControllerProxyV2(controller, logPrinter);
        return controllerProxyV2;
    }


    @Bean
    public ServiceImplV2 serviceImplV2(LogPrinter logPrinter) {
        ServiceImplV2 service = new ServiceImplV2(repositoryImplV2(logPrinter));
        ServiceProxyV2 serviceProxyV2 = new ServiceProxyV2(service, logPrinter);
        return serviceProxyV2;
    }

    @Bean
    public RepositoryImplV2 repositoryImplV2(LogPrinter logPrinter) {
        RepositoryImplV2 repository = new RepositoryImplV2();
        RepositoryProxyV2 repositoryProxyV2 = new RepositoryProxyV2(repository, logPrinter);
        return repositoryProxyV2;
    }
}
