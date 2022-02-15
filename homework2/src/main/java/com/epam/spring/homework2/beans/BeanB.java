package com.epam.spring.homework2.beans;

public class BeanB extends GenericBeanTwo {

    public BeanB(String name, Integer value) {
        super(name, value);
    }

    public void otherCustomInitMethod() {
        System.out.println("inside otherCustomInitMethod()");
    }
}
