package com.star.sud.spring.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class BusinessAppRunner {

    public static void main(String[] args) {

       var context =  new AnnotationConfigApplicationContext(BusinessAppRunner.class);
       var bean = context.getBean(BuisnessCalculationService.class);
       System.out.println(bean.findMax());

    }
}
