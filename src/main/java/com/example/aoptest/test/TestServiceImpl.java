package com.example.aoptest.test;

public class TestServiceImpl implements TestService {

    private TestRepository testRepository;

    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public String func() {
        return testRepository.func();
    }
}
