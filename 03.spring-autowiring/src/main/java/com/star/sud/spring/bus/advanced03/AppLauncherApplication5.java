package com.star.sud.spring.bus.advanced03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class Business {

    // Setter dependency injection
    private SoftWareSolution softWareSolution;

    // Setter dependency injection
    private HardwareSolution hardwareSolution;

    @Autowired
    public void setHardwareSolution(HardwareSolution hardwareSolution) {
        System.out.println("setter injection - setHardwareSolution");
        this.hardwareSolution = hardwareSolution;
    }

    @Autowired
    public void setSoftWareSolution(SoftWareSolution softWareSolution) {
        System.out.println("setter injection - setSoftWareSolution");
        this.softWareSolution = softWareSolution;
    }

    @Override
    public String toString() {
        return "Business{" + "softWareSolution=" + softWareSolution + ", hardwareSolution=" + hardwareSolution + '}';
    }
}

@Component
class SoftWareSolution {

}

@Component
class HardwareSolution {

}


@ComponentScan // will scan the current package as default if we don't specify
@Configuration
public class AppLauncherApplication5 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppLauncherApplication5.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println(context.getBean(Business.class));
    }
}
