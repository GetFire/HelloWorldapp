package com.getfire.spring.ch5.aop.before_security;

import org.springframework.aop.framework.ProxyFactory;

public class SecurityExample {
    public static void main(String[] args) {
        SecurityManager manager = new SecurityManager();
        SecureBean bean = getSecureBean();
        manager.login("chris", "pwd");
        bean.writeSecureMessage();
        manager.logout();
        try {
            manager.login("invaliduser", "pwd");
            bean.writeSecureMessage();
        } catch (SecurityException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            manager.logout();
        }
        try {
            bean.writeSecureMessage();
        } catch (SecurityException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }

    public static SecureBean getSecureBean() {
        SecureBean target = new SecureBean();
        SecurityAdvice advice = new SecurityAdvice();
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(advice);
        pf.setTarget(target);
        return (SecureBean) pf.getProxy();
    }
}
