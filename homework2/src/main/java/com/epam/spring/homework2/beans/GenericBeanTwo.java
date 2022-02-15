package com.epam.spring.homework2.beans;

public class GenericBeanTwo extends GenericBean {


    public GenericBeanTwo(String name, Integer value) {
        super(name, value);
    }

    public void customInitMethod() {
        System.out.println("inside customInitMethod()");
    }

    public void customDestroyMethod() {
        System.out.println("inside customDestroyMethod()");
    }

}
