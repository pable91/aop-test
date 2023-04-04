package com.example.aoptest.test;


public class TestControllerImpl implements TestController {

    private TestService testService;

    public TestControllerImpl(TestService testService) {
        this.testService = testService;
    }

    @Override
    public String func() {
        return testService.func();
    }
}
