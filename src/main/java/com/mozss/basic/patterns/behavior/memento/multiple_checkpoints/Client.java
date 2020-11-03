package com.mozss.basic.patterns.behavior.memento.multiple_checkpoints;

/**
 * @author mozss
 * @create 2019-10-27 8:37
 */
/*
 * 可以看出，客户端角色通过不断改变发起人角色的状态，并将之存储在备忘录里面，造成了五个检查点。通过指明检查点指数可以将其发起人角色恢复
 * 到相应的检查点对应的状态上。
 * */
public class Client {
    private static Originator o = new Originator();
    private static Caretaker c = new Caretaker(o);

    public static void main(String[] args) {
        //改变状态
        o.setState("state 0");
        //建立一个检查点
        c.createMemento();
        //改变状态
        o.setState("state 1");
        //建立一个检查点
        c.createMemento();
        //改变状态
        o.setState("state 2");
        //建立一个检查点
        c.createMemento();
        //改变状态
        o.setState("state 3");
        //建立一个检查点
        c.createMemento();
        //改变状态
        o.setState("state 4");
        //建立一个检查点
        c.createMemento();

        //打印出所有的检查点
        o.printStates();
        //恢复到第二个检查点
        System.out.println("Restoring to 2");
        c.restoreMemento(2);
        o.printStates();
        //恢复到第0个检查点
        System.out.println("Restoring to 0");
        c.restoreMemento(0);
        o.printStates();
        //恢复到第3个检查点
        System.out.println("Restoring to 3");
        c.restoreMemento(3);
        o.printStates();
    }
}
