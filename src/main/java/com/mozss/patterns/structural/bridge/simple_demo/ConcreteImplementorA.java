package com.mozss.patterns.structural.bridge.simple_demo;

/**
 * @author mozss
 * @create 2019-10-29 9:32
 */

public class ConcreteImplementorA extends Implementor {
    /*
     * 某个商业方法的实现化实现
     * */
    @Override
    public void operationImp() {
        System.out.println("Do something ...");
    }
}
