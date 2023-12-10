package com.jayeshxn.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        //1: Launch a Spring Context

        var context =
                new AnnotationConfigApplicationContext(
                        HelloWorldConfiguration.class);

        //2: Configure the things we want Spring to manage- @Configuration
//        System.out.println(context.getBean("name"));
//        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person3Parameters"));
//        System.out.println(context.getBean("address")); //using name of Bean to retrieve a Bean
//
//        System.out.println(context.getBean(Address.class)); //using type of Bean to retrieve a Bean

//        System.out.println(context.getBean("person2MethodCall"));
    }
}
