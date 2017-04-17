package com.getfire.spring.ch4.resourceAcces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.File;

public class ResourceDemo {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext();
        File file = File.createTempFile("text","txt");

        file.deleteOnExit();
        System.out.println(file.getPath());
        Resource res1 = context.getResource("file://" + file.getPath());
        displayInfo(res1);
        Resource res2 = context.getResource("classpath:text.txt");
        displayInfo(res2);
        Resource res3 = context.getResource("https://www.google.com.ua");
        displayInfo(res3);
    }

    private static void displayInfo(Resource res) throws Exception {
        System.out.println(res.getClass());
        System.out.println(res.getURL().getContent());
        System.out.println("");
    }

}
