package com.getfire.spring.ch5.aop.defaultPointcut.dynamicCut;

public class SampleBean {
    public void foo(int x) {
        System.out.println("Invoked foo() with: " + x);
    }

    public void bar(){
        System.out.println("Invoked bar()");
    }
}