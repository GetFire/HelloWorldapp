package com.getfire.spring.ch4.environment;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;

import java.util.HashMap;
import java.util.Map;

public class EnvironmentSample {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        ConfigurableEnvironment env = context.getEnvironment();
        MutablePropertySources propertySources = env.getPropertySources();
        Map appMap = new HashMap();
        appMap.put("application.home","application_home");
        appMap.put("user.home","application_home");

        propertySources.addFirst(new MapPropertySource("PROSPRING4_MAP",appMap));
        System.out.println("user.home: "+ System.getProperty("user.home"));
        System.out.println("JAVA_HOME: "+ System.getProperty("JAVA_HOME"));

        System.out.println("user.home: "+env.getProperty("user.home"));
        System.out.println("JAVA_HOME: "+env.getProperty("JAVA_HOME"));
        System.out.println("application.home: "+env.getProperty("application.home"));
    }
}
