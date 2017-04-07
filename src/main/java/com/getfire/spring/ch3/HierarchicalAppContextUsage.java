package com.getfire.spring.ch3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HierarchicalAppContextUsage {
    public static void main(String[] args) {
        GenericXmlApplicationContext parent = new GenericXmlApplicationContext();
        parent.load("classpath:parent.xml");
        parent.refresh();
        GenericXmlApplicationContext childContext = new GenericXmlApplicationContext();
        childContext.load("classpath:child.xml");
        childContext.setParent(parent);
        childContext.refresh();

        SimpleTarget target1 = childContext.getBean("target1", SimpleTarget.class);
        SimpleTarget target2 = childContext.getBean("target2", SimpleTarget.class);
        SimpleTarget target3 = childContext.getBean("target3", SimpleTarget.class);

        System.out.println(target1.getVal());
        System.out.println(target2.getVal());
        System.out.println(target3.getVal());



    }
}
