package com.getfire.spring.ch5.aop.arround;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

import java.lang.reflect.Method;

public class ProfilingInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        StopWatch sw = new StopWatch();
        sw.start(invocation.getMethod().getName());
        Object returnValue= invocation.proceed();
        sw.stop();
        dumpInfo(invocation, sw.getTotalTimeMillis());
        return returnValue;
    }

    private void dumpInfo(MethodInvocation invocation, long totalTimeMillis) {
        Method m = invocation.getMethod();
        Object target = invocation.getThis();
        Object[] args = invocation.getArguments();
        System.out.println("Executed method: "+ m.getName());
        System.out.println("On object of type: "+ target.getClass().getSimpleName());
        System.out.println("With arguments: ");
        for (int i = 0; i < args.length; i++) {
            System.out.print("       > "+args[i]);
        }
        System.out.print("\n");
        System.out.println("Took: " + totalTimeMillis + " ms");
    }
}
