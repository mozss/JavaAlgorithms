package com.mozss.basic.patterns.behavior.memento.whitebox_demo;

/**
 * @author mozss
 * @create 2019-10-27 7:03
 */

public class Originator {
    private String state;

    /*
     * 工厂方法，返还一个新的备忘录对象
     * */
    public Memento createMemento() {
        return new Memento(state);
    }

    /*
     * 将发起人恢复到备忘录对象所记载的状态
     * */
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    /*
     * 状态的取值方法
     * */
    public String getState() {
        return this.state;
    }

    /*
     * 状态的赋值方法
     * */
    public void setState(String state) {
        this.state = state;
        System.out.println("Current state = " + this.state);
    }
}
