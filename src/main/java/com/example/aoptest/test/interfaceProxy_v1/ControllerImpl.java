package com.example.aoptest.test.interfaceProxy_v1;


public class ControllerImpl implements ControllerInterface {

    private ServiceInterface service;

    public ControllerImpl(ServiceInterface service) {
        this.service = service;
    }

    @Override
    public String func() {
        return service.func();
    }
}
