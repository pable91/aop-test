package com.example.aoptest.test.interfaceProxy_v1.proxy.interfaceProxy;

import com.example.aoptest.test.LogPrinter;
import com.example.aoptest.test.interfaceProxy_v1.ServiceInterface;

public class ServiceProxy implements ServiceInterface {

    private ServiceInterface target;
    private LogPrinter logPrinter;

    public ServiceProxy(ServiceInterface target, LogPrinter logPrinter) {
        this.target = target;
        this.logPrinter = logPrinter;
    }

    @Override
    public String func() {
        logPrinter.print("service");
        return target.func();
    }
}
