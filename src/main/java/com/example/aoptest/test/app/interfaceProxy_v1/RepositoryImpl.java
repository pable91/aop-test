package com.example.aoptest.test.app.interfaceProxy_v1;

public class RepositoryImpl implements RepositoryInterface {

    @Override
    public String func() {
        return "testOK";
    }
}
