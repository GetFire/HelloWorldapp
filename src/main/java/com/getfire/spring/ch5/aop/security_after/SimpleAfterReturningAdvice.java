package com.getfire.spring.ch5.aop.security_after;

import com.getfire.spring.ch5.aop.helloWorld.MessageWriter;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

public class SimpleAfterReturningAdvice implements AfterReturningAdvice {
    public static void main(String[] args) {
        MessageWriter target = new MessageWriter();
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new SimpleAfterReturningAdvice());
        pf.setTarget(target);
        MessageWriter proxy = (MessageWriter) pf.getProxy();
        proxy.writeMessage();
    }

    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("");
        System.out.println("After method: " + method.getName());
    }
}
