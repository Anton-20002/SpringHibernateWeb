package com.test.service;

import org.springframework.stereotype.Component;

/**
 * Created by Anton on 15.08.2018.
 */
@Component
public class TestData {
    public void makeCoffee(String beans) {
        System.out.println("Making " + beans + " coffee!");
    }
}
