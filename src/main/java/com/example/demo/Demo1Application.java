package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(Demo1Application.class, args);
        Products products = app.getBean(Products.class);
        List<String> productsFromApplicationYml = products.getProducts();

        System.out.println(productsFromApplicationYml.size()); // I would like to see 2
        productsFromApplicationYml.forEach(System.out::println); // I would like to see "first" and "second"
    }

}
