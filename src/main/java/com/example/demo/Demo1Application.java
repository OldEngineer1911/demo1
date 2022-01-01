package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
        Products products = new Products();
        List<String> productsFromApplicationYml = products.getProducts();

        System.out.println(productsFromApplicationYml.size()); // I would like to see 2
        products.getProducts().forEach(System.out::println); // I would like to see "first" and "second"
    }

}
