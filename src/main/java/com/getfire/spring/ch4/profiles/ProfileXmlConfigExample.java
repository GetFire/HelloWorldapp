package com.getfire.spring.ch4.profiles;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;
public class ProfileXmlConfigExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:ch4/*-config.xml");
//        context.getEnvironment().setActiveProfiles("highschool");
        context.refresh();

        FoodProvidersService foodProvidersService = context.getBean( FoodProvidersService.class);
        List<Food> lunchSet = foodProvidersService.provideLunchSet();
        for (Food food : lunchSet) {
            System.out.println("Food: "+ food.getName());
        }
    }
}
