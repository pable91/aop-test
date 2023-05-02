package com.example.aoptest.test.app.concreateProxy_v2.concreteProxy;

import com.example.aoptest.test.LogPrinter;
import com.example.aoptest.test.app.concreateProxy_v2.ServiceImplV2;

public class ServiceProxyV2 extends ServiceImplV2 {

    private ServiceImplV2 target;
    private LogPrinter logPrinter;

    public ServiceProxyV2(ServiceImplV2 target, LogPrinter logPrinter) {
        super(null);
        this.target = target;
        this.logPrinter = logPrinter;
    }

    @Override
    public String func() {
        logPrinter.print("service");
        return target.func();
    }
}
