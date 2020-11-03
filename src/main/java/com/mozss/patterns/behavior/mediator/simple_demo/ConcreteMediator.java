package com.mozss.patterns.behavior.mediator.simple_demo;

/**
 * @author mozss
 * @create 2019-10-28 19:12
 */

public class ConcreteMediator extends Mediator {
    private Colleaguel1 colleaguel1;
    private Colleaguel2 colleaguel2;

    /*
     * 事件方法的具体实现
     * */
    @Override
    public void colleagueChanged(Colleague c) {
        colleaguel1.action();
        colleaguel2.action();
    }

    /*
     * 工厂方法，创建同事对象
     * */
    public void createConcreteMediator() {
        colleaguel1 = new Colleaguel1(this);
        colleaguel2 = new Colleaguel2(this);
    }

    /*
     * 取值方法，提供同事对象
     * */
    public Colleaguel1 getColleaguel1() {
        return colleaguel1;
    }

    /*
     * 取值方法，提供同事对象
     * */
    public Colleaguel2 getColleaguel2() {
        return colleaguel2;
    }
}
