package com.getfire.spring.ch4.environment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlaceHolderSample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ch4/app-context.xml");
        AppProperty appProperty = context.getBean("appProperty", AppProperty.class);

        System.out.println("application.home: " + appProperty.getApplicationHome());
        System.out.println("user.home: " + appProperty.getUserHome());
    }
}
