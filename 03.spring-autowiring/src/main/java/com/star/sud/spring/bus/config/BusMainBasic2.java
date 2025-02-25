package com.star.sud.spring.bus.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BusMainBasic2 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(BusConig2.class);
        System.out.println(context.getBean("ksrtcBusRunner"));
        System.out.println(context.getBean("bmtcBusRunner"));
        System.out.println(context.getBean(BusConsole2.class));
        System.out.println(context.getBean("bmtcBusRunner2"));
        System.out.println("============");
        var runnerCtx = (BusRunner2) context.getBean("busRunner");
        runnerCtx.run();

        var runnerCtx2 = (BusRunner2) context.getBean("busRunner2");
        runnerCtx2.run();

        var runnerCtx3 = (BusRunner2) context.getBean("busRunner3");
        runnerCtx3.run();
    }
}
