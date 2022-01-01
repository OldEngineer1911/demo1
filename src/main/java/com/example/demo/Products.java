package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(prefix="products")
public class Products {
    private final List<String> products = new ArrayList<>();

    public List<String> getProducts() {
        return products;
    }
}
