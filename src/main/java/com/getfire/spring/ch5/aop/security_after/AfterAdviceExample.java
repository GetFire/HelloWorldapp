package com.getfire.spring.ch5.aop.security_after;

import org.springframework.aop.framework.ProxyFactory;

public class AfterAdviceExample {
    private static KeyGenerator getKeyGenerator() {
        KeyGenerator target = new KeyGenerator();
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvice(new WeakKeyCheckAdvice());
        return (KeyGenerator) pf.getProxy();
    }

    public static void main(String[] args) {
        KeyGenerator keyGenerator = getKeyGenerator();
        for (int i = 0; i < 10; i++) {
            try {
                long key = keyGenerator.getKey();
                System.out.println("Key: " + key);
            }catch (SecurityException e){
                System.out.println("Weak Key Generated!");
                System.out.println(e.getMessage());
            }
        }
    }
}
