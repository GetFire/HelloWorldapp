package com.getfire.spring.ch5.aop.arround;

import org.springframework.aop.framework.ProxyFactory;

public class ProfilingExample {
    public static void main(String[] args) {
        WorkerBean bean = getWorkerBean();
        bean.doSomeWork(1000000);
    }

    private static WorkerBean getWorkerBean() {
        WorkerBean target = new WorkerBean();
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvice(new ProfilingInterceptor());
        return (WorkerBean) pf.getProxy();
    }


}
