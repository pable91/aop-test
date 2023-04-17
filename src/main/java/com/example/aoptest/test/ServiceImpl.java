package com.example.aoptest.test;

public class ServiceImpl implements ServiceInterface {

    private RepositoryInterface repositoryInterface;

    public ServiceImpl(RepositoryInterface repositoryInterface) {
          this.repositoryInterface = repositoryInterface;
    }

    @Override
    public String func() {
        return repositoryInterface.func();
    }
}
