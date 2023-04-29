package com.example.aoptest.test.concreateProxy_v2.concreteProxy;

import com.example.aoptest.test.concreateProxy_v2.ControllerImplV2;
import com.example.aoptest.test.LogPrinter;

public class ControllerProxyV2 extends ControllerImplV2 {

    private ControllerImplV2 target;
    private LogPrinter logPrinter;

    public ControllerProxyV2(ControllerImplV2 controllerImplV2, LogPrinter logPrinter) {
        super(null);
        this.target = controllerImplV2;
        this.logPrinter = logPrinter;
    }

    @Override
    public String func() {
        logPrinter.print("controller");
        return target.func();
    }
}
