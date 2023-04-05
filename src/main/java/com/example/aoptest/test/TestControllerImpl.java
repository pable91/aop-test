package com.example.aoptest.test;


public class TestControllerImpl implements TestController {

    private TestService testService;
    private LogPrinter logPrinter;

    public TestControllerImpl(TestService testService, LogPrinter logPrinter) {
        this.logPrinter = logPrinter;
        this.testService = testService;
    }

    @Override
    public String func() {
        logPrinter.print("controller");
        return testService.func();
    }
}
