package com.star.sud.spring;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        var name = context.getBean("name");
        var age = context.getBean("age");
        var userDetail = context.getBean("getUser");
        var address2 = context.getBean("address2");
        var address = context.getBean(Address.class);
        var userToMethodCall = context.getBean("userToMethodCall");
        var userToParameter = context.getBean("userToParameter");
        var userDetailByClass = context.getBean(UserDetails.class);
        var userByAddressQualifier = context.getBean("userByAddressQualifier");
        System.out.println(name);
        System.out.println(age);
        System.out.println(userDetail);
        System.out.println(address2);
        System.out.println(address);
        System.out.println(userToMethodCall);
        System.out.println(userToParameter);
        System.out.println(userDetailByClass);

        //  System.out.println("========= Printing all the managed spring beans =========");
        // Get all the managed beans
        // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(userByAddressQualifier);
    }
}
