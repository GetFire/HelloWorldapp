package com.getfire.spring.ch4.jsr330;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Jsr330Example {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ch4/app-context-jsr.xml");
        MessageRendererJsr rendererJsr = context.getBean("messageRendererJsr", MessageRendererJsr.class);
        rendererJsr.render();
    }
}
