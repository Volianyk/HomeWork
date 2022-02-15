package com.epam.spring.homework2.beans;

public class GenericBean {
    private String name;
    private Integer value;

    public GenericBean(String name, Integer value) {
        this.name = name;
        this.value = value;
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
