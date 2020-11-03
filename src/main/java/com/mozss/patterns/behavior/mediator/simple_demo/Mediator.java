package com.mozss.patterns.behavior.mediator.simple_demo;

/**
 * @author mozss
 * @create 2019-10-28 18:53
 */

abstract public class Mediator {
    /*
     * 事件方法，由子类实现
     * */
    public abstract void colleagueChanged(Colleague c);

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.createConcreteMediator();
        Colleaguel1 c1 = new Colleaguel1(mediator);
        Colleaguel2 c2 = new Colleaguel2(mediator);
        mediator.colleagueChanged(c1);
    }
}
