package com.getfire.spring.ch3.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleBean {
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ch3/appcontext.xml");
        SimpleBean parent = context.getBean("inheritParent", SimpleBean.class);
        SimpleBean child = context.getBean("inheritChild", SimpleBean.class);

        System.out.println("Parent:\n" + parent);
        System.out.println("Child: \n" + child);
    }
}
