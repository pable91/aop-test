package com.example.aoptest.test.app.interfaceProxy_v1.proxy.interfaceProxy;

import com.example.aoptest.test.LogPrinter;
import com.example.aoptest.test.app.interfaceProxy_v1.RepositoryInterface;

public class RepositoryProxy implements RepositoryInterface {

    private RepositoryInterface target;
    private LogPrinter logPrinter;

    public RepositoryProxy(RepositoryInterface repositoryInterface, LogPrinter logPrinter) {
        this.target = repositoryInterface;
        this.logPrinter = logPrinter;
    }

    @Override
    public String func() {
        logPrinter.print("repository");
        return target.func();
    }
}
