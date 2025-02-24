package com.star.sud.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        var name = context.getBean("name");
        var age = context.getBean("age");
        var userDetail = context.getBean("getUser");
        var address2 = context.getBean("address2");
        var address = context.getBean(Address.class);
        System.out.println(name);
        System.out.println(age);
        System.out.println(userDetail);
        System.out.println(address2);
        System.out.println(address);
    }
}
