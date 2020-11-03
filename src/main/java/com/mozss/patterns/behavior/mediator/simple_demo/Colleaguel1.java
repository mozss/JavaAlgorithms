package com.mozss.patterns.behavior.mediator.simple_demo;

/**
 * @author mozss
 * @create 2019-10-28 19:07
 */

public class Colleaguel1 extends Colleague {
    /*
     * 这里由于父类是抽象类
     * 必须实现构造方法
     * 作为参量接收调停者对象
     * */
    public Colleaguel1(Mediator m) {
        super(m);
    }

    /*
     * 行动方法的具体实现
     * */
    @Override
    public void action() {
        System.out.println("This is an action from Colleaguel 1");
    }
}
