package com.mozss.basic.patterns.behavior.chain_of_responsibility.simple_demo;

/**
 * @author mozss
 * @create 2019-10-26 12:56
 */

public class Client {
    static private Handler handler1, handler2;

    public static void main(String[] args) {
        handler1 = new ConcreteHandler();
        handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        handler1.handleRequest();
    }
}
