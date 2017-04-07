package com.getfire.spring.ch3.lookup.methodReplacement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StopWatch;

public class MethodReplacementExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
        ReplaceTarget replaceTarget = context.getBean("replacementTarget", ReplaceTarget.class);
        ReplaceTarget standartTarget = context.getBean("standartTarget", ReplaceTarget.class);
        dispalyInfo(replaceTarget);
        dispalyInfo(standartTarget);
    }

    private static void dispalyInfo(ReplaceTarget target) {
        
        System.out.println(target.formatMessage("Hello World!"));
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("perTest");
        for (int i = 0; i < 100000; i++) {
            String out = target.formatMessage("foo");
        }
        stopWatch.stop();
        System.out.println("100000 invocations took "+ stopWatch.getTotalTimeMillis() + " ms");
    }
}
