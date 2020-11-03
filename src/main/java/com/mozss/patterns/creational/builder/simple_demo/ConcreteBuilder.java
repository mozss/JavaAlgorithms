package com.mozss.patterns.creational.builder.simple_demo;

/**
 * @author mozss
 * @create 2019-10-30 13:55
 */

public class ConcreteBuilder extends Builder {
    private Product product = new Product();

    @Override
    public void buildPart1() {
        //build the first part of the product
    }

    @Override
    public void buildPart2() {
        //build the second part of the product
    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}
