package com.getfire.spring.ch5.aop.defaultPointcut.staticCut;

import com.getfire.spring.ch5.aop.defaultPointcut.staticCut.BeanOne;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

public class SimpleStaticPointcut extends StaticMethodMatcherPointcut {
    @Override
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> clazz) {
                return (clazz == BeanOne.class);
            }
        };
    }

    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        return ("foo".equals(method.getName()));
    }
}
