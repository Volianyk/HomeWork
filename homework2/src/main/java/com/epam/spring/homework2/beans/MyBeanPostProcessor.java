package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        //System.out.println("inside BeanPostProcessor.postProcessBeforeInitialization");
        // System.out.println(">> bean= " + bean + ", beanName= " + beanName);
        return bean;
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("inside BeanPostProcessor.postProcessAfterInitialization");
        if (bean instanceof GenericBean) {
            if (((GenericBean) bean).getName() == null) {
                throw new IllegalArgumentException("Name should not be null");

            }

            if (((GenericBean) bean).getValue() <0) {

                throw new IllegalArgumentException("Value for bean: " +beanName+  " should be positive");
            }

            System.out.println(">>> bean=" + bean + ", beanName=" + beanName);
            return bean;
        }
        return bean;
    }
}
