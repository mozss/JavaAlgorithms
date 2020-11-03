package com.mozss.patterns.behavior.memento.blackbox_demo;

/**
 * @author mozss
 * @create 2019-10-27 7:51
 */

public class Client {
    private static Originator o = new Originator();
    private static Caretaker c = new Caretaker();

    public static void main(String[] args) {
        //改变负责任对象的状态
        o.setState("On");
        //创建备忘录对象，并将发起人对象的状态存储起来
        c.saveMemento(o.createMemento());
        //修改发起人对象的状态
        o.setState("Off");
        //恢复发起人的状态
        o.restoreMemento(c.retrieveMemento());
    }
}
