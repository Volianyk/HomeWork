package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanA extends GenericBean implements InitializingBean, DisposableBean {

    public BeanA(String name, Integer value) {
        super(name, value);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("inside DisposableBean.destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("inside InitializingBean.afterPropertiesSet()");
    }
}
