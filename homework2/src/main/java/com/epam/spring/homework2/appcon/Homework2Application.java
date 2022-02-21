package com.epam.spring.homework2.appcon;

import com.epam.spring.homework2.config.BeanConfigOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

@Import(BeanConfigOne.class)
public class Homework2Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigOne.class);
        System.out.println(" \n-ApplicationContext is ready to use-\n");

        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(context.getBeanDefinition(beanDefinitionName));
        }
        context.close();
    }
}
