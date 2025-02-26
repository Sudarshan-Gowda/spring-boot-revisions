package com.star.sud.spring.bus.advanced04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class Business {

    // Constructor dependency injection
    private SoftWareSolution softWareSolution;

    // Constructor dependency injection
    private HardwareSolution hardwareSolution;

   // @Autowired  - Not required to add this
    public Business(SoftWareSolution softWareSolution, HardwareSolution hardwareSolution) {
        System.out.println("constructor injection");
        this.softWareSolution = softWareSolution;
        this.hardwareSolution = hardwareSolution;
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
public class AppLauncherApplication6 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppLauncherApplication6.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println(context.getBean(Business.class));
    }
}
