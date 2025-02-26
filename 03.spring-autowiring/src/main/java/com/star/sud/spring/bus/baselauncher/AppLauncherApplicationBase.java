package com.star.sud.spring.bus.baselauncher;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@ComponentScan
@Configuration
public class AppLauncherApplicationBase {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppLauncherApplicationBase.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
