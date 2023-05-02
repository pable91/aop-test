package com.example.aoptest.test.app.interfaceProxy_v1.proxy.interfaceProxy;

import com.example.aoptest.test.LogPrinter;
import com.example.aoptest.test.app.interfaceProxy_v1.ControllerInterface;

public class ControllerProxy implements ControllerInterface {

    private ControllerInterface target;
    private LogPrinter logPrinter;

    public ControllerProxy(ControllerInterface controllerInterface, LogPrinter logPrinter) {
        this.target = controllerInterface;
        this.logPrinter = logPrinter;
    }

    @Override
    public String func() {
        logPrinter.print("controller");
        return target.func();
    }
}
