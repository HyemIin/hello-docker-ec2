package com.example.hello_docker_ec2;

import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext((AppConfig.class));

    public static void main(String[] args) {
        String[] beanDefinitionName = ac.getBeanDefinitionNames();
        for (String s : beanDefinitionName) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(s);
            System.out.println(beanDefinition);
        }
    }
    void findAllBean() {


    }
}
