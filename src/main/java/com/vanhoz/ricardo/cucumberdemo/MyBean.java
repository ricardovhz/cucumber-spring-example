package com.vanhoz.ricardo.cucumberdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class MyBean {

    Map<String, Integer> productPrices;

    @PostConstruct
    public void setup() {
        System.out.println("construct");
        this.productPrices = new ConcurrentHashMap<>();
    }

    public void givePrices(String product, int price) {
        System.out.println("giving price to " + product + ": " + price);
        this.productPrices.put(product, price);
    }

    public int calculate(String product, int count) {
        System.out.println("calculating " + product);
        return this.productPrices.get(product) * count;
    }

}
