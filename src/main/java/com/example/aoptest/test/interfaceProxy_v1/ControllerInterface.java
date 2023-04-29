package com.example.aoptest.test.interfaceProxy_v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping
@ResponseBody
public interface ControllerInterface {

    @GetMapping("v1/test/func")
    String func();
}
