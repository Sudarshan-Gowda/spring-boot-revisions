package com.star.sud.spring.bus.advanced02;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class Business{

    //Field dependency injection
    @Autowired
    private SoftWareSolution softWareSolution;

    //Field dependency injection
    @Autowired
    private  HardwareSolution hardwareSolution;

    @Override
    public String toString() {
        return "Business{" +
                "softWareSolution=" + softWareSolution +
                ", hardwareSolution=" + hardwareSolution +
                '}';
    }
}

@Component
class SoftWareSolution{

}

@Component
class HardwareSolution{

}


@ComponentScan // will scan the current package as default if we don't specify
@Configuration
public class AppLauncherApplication4 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppLauncherApplication4.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println(context.getBean(Business.class));
    }
}
