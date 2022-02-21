package com.epam.spring.homework2.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanE extends GenericBean {

    public BeanE(String name, Integer value) {
        super(name, value);
    }

    @PostConstruct
    public void postConstruct() throws Exception {
        System.out.println("inside @PostConstruct");
    }

    @PreDestroy
    public void preDestroy() throws Exception {
        System.out.println("inside @PreDestroy");
    }
}
