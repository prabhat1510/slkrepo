package beanlifecycleanotherexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beanlifecycleanotherexample.beans.MySpringBean;
import beanlifecycleanotherexample.processor.MyBeanPostProcessor;

@Configuration
public class MySpringConfiguration {

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public MySpringBean mySpringBean(){
        return new MySpringBean();
    }

}