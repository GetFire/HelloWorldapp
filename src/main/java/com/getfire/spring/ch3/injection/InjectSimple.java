package com.getfire.spring.ch3.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectSimple {
    private String name;
    private int age;
    private float height;
    private boolean programmer;
    private long ageInSeconds;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
        InjectSimple simple = context.getBean("injectSimple", InjectSimple.class);
        System.out.println(simple);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public void setAgeInSeconds(long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    @Override
    public String toString() {
        return "{"
                + "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "AgeInSeconds: " + ageInSeconds + "\n"
                + "Height: " + height + "\n"
                + "Is programmer? " + programmer + "\n"
                + '}';
    }
}
