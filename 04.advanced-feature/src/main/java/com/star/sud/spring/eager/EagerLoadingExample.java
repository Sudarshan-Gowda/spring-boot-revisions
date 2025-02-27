package com.star.sud.spring.eager;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
class Cricket {

}

@Component
class TestCricket {

    private Cricket cricket;

    TestCricket(Cricket cricket) {
        System.out.println("Initializing Test Cricket");
        this.cricket = cricket;
    }

    void getTheCricketName(){
        System.out.println("Running Test Cricket");
    }

}

//Initializing Test Cricket
//Initialized spring context

@Component
@ComponentScan
public class EagerLoadingExample {

    public static void main(String[] args) {

       try (var context = new AnnotationConfigApplicationContext(EagerLoadingExample.class)){
           System.out.println("Initialized spring context");
          // context.getBean(TestCricket.class).getTheCricketName();
       }

    }

}
