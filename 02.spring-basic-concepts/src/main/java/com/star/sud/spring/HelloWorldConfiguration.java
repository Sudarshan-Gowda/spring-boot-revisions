package com.star.sud.spring;

import org.apache.catalina.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record UserDetails(String name, int age) {
}
record Address(String address1, String city, String postalCode ){}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Sudarshan";
    }

    @Bean
    public int age(){
        return 20;
    }

    @Bean
    public UserDetails getUser(){
        return new UserDetails("Ram", 25);
    }

    @Bean("address2")
    public Address getAddress() {
        return new Address("Bangalore", "India", "560066");
    }

}
