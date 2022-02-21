package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.BeanB;
import com.epam.spring.homework2.beans.BeanC;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;

@PropertySource("my.properties")
@Configuration
public class BeanConfigTwo {

    @Bean(initMethod = "customInitMethod",
            destroyMethod = "customDestroyMethod")
    @DependsOn("beanD")
    BeanB beanB(@Value("${properties.beanB.name}") String beanBName,
                @Value("${properties.beanB.value}") Integer beanBValue) {
        return new BeanB(beanBName, beanBValue);
    }

    @Bean(initMethod = "customInitMethod",
            destroyMethod = "customDestroyMethod")
    @DependsOn("beanB")
    BeanC beanC(@Value("${properties.beanC.name}") String beanCName,
                @Value("${properties.beanC.value}") Integer beanCValue) {
        return new BeanC(beanCName, beanCValue);
    }

    @Bean(initMethod = "customInitMethod",
            destroyMethod = "customDestroyMethod")
    BeanC beanD(@Value("${properties.beanD.name}") String beanDName,
                @Value("${properties.beanD.value}") Integer beanDValue) {
        return new BeanC(beanDName, beanDValue);
    }
}
