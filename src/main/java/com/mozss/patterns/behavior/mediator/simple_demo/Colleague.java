package com.mozss.patterns.behavior.mediator.simple_demo;

/**
 * @author mozss
 * @create 2019-10-28 18:53
 */
public abstract class Colleague {
    private Mediator mediator;

    /*
     * 构造函数，作为参量接收调停者对象
     * */
    public Colleague(Mediator m) {
        mediator = m;
    }

    /*
     * 取值方法
     * */
    public Mediator getMediator() {
        return mediator;
    }

    /*
     * 行为方法，由子类实现
     * */
    public abstract void action();

    /*
     * 示意性的商业方法，调用此方法
     * 可以改变对象的内部状态
     * */
    public void change() {
        mediator.colleagueChanged(this);
    }
}
