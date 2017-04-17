package com.getfire.spring.ch5.aop.defaultPointcut.nameMatching;

public class NameBean {
    public void foo(int x) {
        System.out.println("foo " + x);
    }

    public void foo(){
        System.out.println("foo");
    }

    public void bar(){
        System.out.println("bar");
    }

    public void yup(){
        System.out.println("yup");
    }
}
