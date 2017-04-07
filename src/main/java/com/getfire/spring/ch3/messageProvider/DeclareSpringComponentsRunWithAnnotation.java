package com.getfire.spring.ch3.messageProvider;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponentsRunWithAnnotation {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:application-context.xml");
        ctx.refresh();
        MessageProvider messageProvider = ctx.getBean("messageProviderConst", MessageProvider.class);
        System.out.println(messageProvider.getMessage());

        MessageRenderer messageRenderer = ctx.getBean("messageRenderer",MessageRenderer.class);
        messageRenderer.render();
    }
}
