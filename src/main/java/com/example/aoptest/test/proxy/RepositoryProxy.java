package com.example.aoptest.test.proxy;

import com.example.aoptest.test.LogPrinter;
import com.example.aoptest.test.RepositoryInterface;

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
