package com.getfire.spring.ch3.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectSimpleConfig {
    private String name = "Denis Azhymov";
    private int age = 24;
    private float height = 1.65f;
    private boolean programmer = true;
    private long ageInSeconds = 1123546654;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ch3/appcontext.xml");
        InjectSimple simple = context.getBean("injectSimple", InjectSimple.class);
        System.out.println(simple);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public long getAgeInSeconds() {
        return ageInSeconds;
    }

    public void setAgeInSeconds(long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    @Override
    public String toString() {
        return "{"
                + "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Age in seconds: " + ageInSeconds + "\n"
                + "Height: " + height + "\n"
                + "Is programmer? " + programmer + "\n"
                + '}';
    }
}
