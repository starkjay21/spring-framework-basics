package com.jayeshxn.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) { };
//defining as record automatically creates constructor, getters, toString, etc.
record Address (String firstLine, String city) { };

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
       return "Jayesh";
    }

    @Bean
    public int age() {
        return 20;
    }

    @Bean
    public Person person() {
        var person = new Person("Ravi", 22, new Address("Main Street", "London"));

        return person;
    }

    @Bean(name = "address")
    public Address address() {
        return new Address("JA/11", "Rourkela");
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address) { //name, age, address
        return new Person(name, age, address);
    }
}
