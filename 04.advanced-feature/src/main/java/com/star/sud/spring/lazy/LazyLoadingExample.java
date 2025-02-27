package com.star.sud.spring.lazy;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class Cricket {

}

@Component
@Lazy
class TestCricket {

    private Cricket cricket;

    TestCricket(Cricket cricket) {
        System.out.println("Initializing Test Cricket");
        this.cricket = cricket;
    }

    void getTheCricketName() {
        System.out.println("Running Test Cricket");
    }

}

//Initialized spring context

// Note: By default bean won't be initialized, it will be loaded only when we access it.

@Component
@ComponentScan
public class LazyLoadingExample {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(LazyLoadingExample.class)) {
            System.out.println("Initialized spring context");
            //   context.getBean(TestCricket.class).getTheCricketName();
        }

    }

}
