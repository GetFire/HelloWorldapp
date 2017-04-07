package com.getfire.spring.ch3.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {

    private Map<String, Object> map;
    private Properties props;
    private List list;
    private Set set;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
        CollectionInjection instance = context.getBean("injectCollection", CollectionInjection.class);
        instance.displayInfo();

    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    private void displayInfo() {
        System.out.println(" Map contents: \n");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        System.out.println("\n Properties contents: \n");
        for (Map.Entry<Object, Object> entry : props.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        System.out.println("\n Set contents:\n");
        for (Object o : set) {
            System.out.println("Value: " + o);
        }

        System.out.println("\nList contents:\n");
        for (Object o : list) {
            System.out.println("Value: " + o);
        }
    }
}
