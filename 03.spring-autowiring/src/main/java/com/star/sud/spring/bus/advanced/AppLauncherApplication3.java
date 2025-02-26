package com.star.sud.spring.bus.advanced;

import org.springframework.context.annotation.*;

@ComponentScan("com.star.sud.spring.bus.advanced")
@Configuration
public class AppLauncherApplication3 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppLauncherApplication3.class);
        context.getBean(BusConsole3.class).busType();
        context.getBean(BusRunner3.class).run();
    }
}
