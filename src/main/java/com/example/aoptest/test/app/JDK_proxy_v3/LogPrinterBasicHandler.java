package com.example.aoptest.test.app.JDK_proxy_v3;

import com.example.aoptest.test.LogPrinter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogPrinterBasicHandler implements InvocationHandler {

    private final Object target;
    private final LogPrinter logPrinter;

    public LogPrinterBasicHandler(Object target, LogPrinter logPrinter) {
        this.target = target;
        this.logPrinter = logPrinter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String message = method.getDeclaringClass().getSimpleName();
        logPrinter.print(message);

        Object result = method.invoke(target, args);

        return result;
    }
}
