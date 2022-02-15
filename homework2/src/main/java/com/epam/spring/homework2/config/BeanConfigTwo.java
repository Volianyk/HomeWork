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

    @Value("${properties.beanB.name}")
    private String beanBName;
    @Value("${properties.beanB.value}")
    private Integer beanBValue;

    @Value("${properties.beanC.name}")
    private String beanCName;
    @Value("${properties.beanC.value}")
    private Integer beanCValue;

    @Value("${properties.beanD.name}")
    private String beanDName;
    @Value("${properties.beanD.value}")
    private Integer beanDValue;

    @Bean(initMethod = "customInitMethod",
            destroyMethod = "customDestroyMethod")
    @DependsOn("beanD")
    BeanB beanB() {
        return new BeanB(beanBName, beanBValue);
    }

    @Bean(initMethod = "customInitMethod",
            destroyMethod = "customDestroyMethod")
    @DependsOn("beanB")
    BeanC beanC() {
        return new BeanC(beanCName, beanCValue);
    }

    @Bean(initMethod = "customInitMethod",
            destroyMethod = "customDestroyMethod")
    BeanC beanD() {
        return new BeanC(beanDName, beanDValue);
    }
}
