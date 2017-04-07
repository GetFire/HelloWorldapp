package com.getfire.spring.ch3.lookup.lookupMethod;

import com.getfire.spring.ch3.MyHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StopWatch;

public class LookupDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
        DemoBean abstractBean = context.getBean("abstractLookupBean", DemoBean.class);
        DemoBean standartBean = context.getBean("standartLookupBean", DemoBean.class);

        displayInfo(standartBean);
        displayInfo(abstractBean);
    }

    private static void displayInfo(DemoBean bean) {
        MyHelper helper1 = bean.getMyHelper();
        MyHelper helper2 = bean.getMyHelper();

        System.out.println("Helper Instances the Same?: " + (helper1 == helper2));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("lookupDemo");

        for (int i = 0; i < 100000; i++) {
            MyHelper helper = bean.getMyHelper();
            helper.doSomethingHelpful();
        }
        stopWatch.stop();

        System.out.println("100000 gets took "+ stopWatch.getTotalTimeMillis() + " ms");

    }

}
