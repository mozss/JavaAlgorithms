package com.mozss.patterns.behavior.memento.whitebox_demo;

/**
 * @author mozss
 * @create 2019-10-27 7:12
 */
/*
 * 示意性客户端实现代码
 * */
public class Client {
    private static Originator o = new Originator();
    private static Caretaker c = new Caretaker();

    /*
     * 由于负责人角色示意实现，故下方代码只是示意性
     * */
    public static void main(String[] args) {
        //改变负责人对象的状态
        o.setState("On");
        //创建备忘录角色对象，并将发起人对象的状态存储起来
        //c.saveMemento(o.createMemento());
        //修改发起人对象的状态
        o.setState("Off");
        //恢复发起人对象的状态(即On状态)
        //o.restoreMemento(c.retrieveMemento());
    }
}
