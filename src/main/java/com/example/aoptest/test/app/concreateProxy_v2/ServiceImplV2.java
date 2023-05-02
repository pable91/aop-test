package com.example.aoptest.test.app.concreateProxy_v2;

public class ServiceImplV2 {

    private final RepositoryImplV2 repository;

    public ServiceImplV2(RepositoryImplV2 repository) {
        this.repository = repository;
    }

    public String func() {
        return repository.func();
    }
}
