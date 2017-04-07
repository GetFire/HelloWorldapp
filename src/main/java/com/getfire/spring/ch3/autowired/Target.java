package com.getfire.spring.ch3.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Target {
    private Foo foo;
    private Foo foo2;
    private Bar bar;

    public Target() {
    }

    public Target(Foo foo){
        System.out.println("Target(Foo) called");
    }

    public Target(Foo foo, Bar bar) {
        System.out.println("Target(Foo, Bar) called");
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
        System.out.println("Property foo set");
    }

    public void setFoo2(Foo foo2) {
        this.foo2 = foo2;
        System.out.println("Property foo2 set");
    }

    public void setBar(Bar bar) {
        this.bar = bar;
        System.out.println("Property bar set");
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
        Target t = null;
        System.out.println("Using by Name:\n");
        t = context.getBean("targetByName",Target.class);
        System.out.println("\nUsing by Type:\n");
        t = context.getBean("targetByType", Target.class);
        System.out.println("\nUsing by Constructor:\n");
        t = context.getBean("targetConstructor",Target.class);
    }
}
