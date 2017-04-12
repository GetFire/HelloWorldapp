package com.getfire.spring.ch4.i18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class MessageSourceDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ch4/app-context.xml");
        Locale english = Locale.ENGLISH;
        Locale czech = new Locale("cs","CZ");
        System.out.println(context.getMessage("msg",null,english));
        System.out.println(context.getMessage("msg",null,czech));
        System.out.println(context.getMessage("nameMsg",new Object[]{"Denys","Azhymov"},english));
    }
}
