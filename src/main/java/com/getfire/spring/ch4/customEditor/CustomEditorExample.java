package com.getfire.spring.ch4.customEditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomEditorExample {
    private Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ch4/app-context.xml");
        CustomEditorExample bean = context.getBean("exampleBean",CustomEditorExample.class);
        System.out.println(bean.getName());
    }
}
