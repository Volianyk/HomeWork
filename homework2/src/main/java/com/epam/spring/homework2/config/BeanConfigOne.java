package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.*;
import org.springframework.context.annotation.*;

@Configuration
@Import(BeanConfigTwo.class)
public class BeanConfigOne {

    @Bean
    public BeanA beanA() {
        return new BeanA("beanA", 1);
    }

    @Bean
    BeanE beanE() {
        return new BeanE("beanE", 2);
    }

    @Bean
    @Lazy
    BeanF beanF() {
        return new BeanF("beanF", 5);
    }

    @Bean
    MyBeanPostProcessor getMyBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }

    @Bean
    MyBeanFactoryPostProcessor getMyBeanFactoryPostProcessor() {
        return new MyBeanFactoryPostProcessor();
    }
}
