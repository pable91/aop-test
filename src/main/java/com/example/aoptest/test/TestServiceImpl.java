package com.example.aoptest.test;

public class TestServiceImpl implements TestService {

    private TestRepository testRepository;
    private LogPrinter logPrinter;

    public TestServiceImpl(TestRepository testRepository, LogPrinter logPrinter) {
        this.logPrinter = logPrinter;
        this.testRepository = testRepository;
    }

    @Override
    public String func() {
        logPrinter.print("service");
        return testRepository.func();
    }
}
