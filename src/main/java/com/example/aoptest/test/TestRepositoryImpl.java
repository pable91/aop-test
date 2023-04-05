package com.example.aoptest.test;

public class TestRepositoryImpl implements TestRepository {

    private LogPrinter logPrinter;

    public TestRepositoryImpl(LogPrinter logPrinter) {
        this.logPrinter = logPrinter;
    }

    public String func() {
        logPrinter.print("repository");
        return "testOK";
    }
}
