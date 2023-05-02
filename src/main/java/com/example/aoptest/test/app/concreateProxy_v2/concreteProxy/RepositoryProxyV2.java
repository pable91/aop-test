package com.example.aoptest.test.app.concreateProxy_v2.concreteProxy;

import com.example.aoptest.test.LogPrinter;
import com.example.aoptest.test.app.concreateProxy_v2.RepositoryImplV2;

public class RepositoryProxyV2 extends RepositoryImplV2 {

    private RepositoryImplV2 target;
    private LogPrinter logPrinter;

    public RepositoryProxyV2(RepositoryImplV2 target, LogPrinter logPrinter) {
        this.target = target;
        this.logPrinter = logPrinter;
    }

    @Override
    public String func() {
        logPrinter.print("repository");
        return target.func();
    }
}
