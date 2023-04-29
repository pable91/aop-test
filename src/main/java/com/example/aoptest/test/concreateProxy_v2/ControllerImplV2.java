package com.example.aoptest.test.concreateProxy_v2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping
@ResponseBody
public class ControllerImplV2 {

    private final ServiceImplV2 service;

    public ControllerImplV2(ServiceImplV2 service) {
        this.service = service;
    }

    @GetMapping("v2/test/func")
    public String func() {
        return service.func();
    }
}
