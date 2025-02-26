package com.star.sud.spring.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record UserDetails(String name, int age, Address address) {
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

    @Primary
    @Bean
    public UserDetails getUser(){
        return new UserDetails("Ram", 25, new Address("Mysore", "India", "570011"));
    }

    @Bean("address2")
    public Address getAddress2() {
        return new Address("Bangalore", "India", "560066");
    }

    @Primary
    @Bean("address3")
    public Address getAddress3() {
        return new Address("Hassan", "India", "573115");
    }

    @Bean("address4")
    @Qualifier("address4Qualifier")
    public Address getAddress4() {
        return new Address("CKM", "India", "580080");
    }

    @Bean
    public UserDetails userToMethodCall(){
        return new UserDetails(name(), age(), getAddress2());
    }

    @Bean
    public UserDetails userToParameter(String name, int age, Address address3){
        return new UserDetails(name, age, address3);
    }

    @Bean
    public UserDetails userByAddressQualifier(String name, int age, @Qualifier("address4Qualifier") Address address3){
        return new UserDetails(name, age, address3);
    }

}
