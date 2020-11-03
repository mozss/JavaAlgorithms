package com.mozss.patterns.behavior.memento.history_on_self_demo;

/**
 * @author mozss
 * @create 2019-10-27 9:35
 */
/*
 * 下方是示意性的客户端角色的实现，由于没有独立的负责人角色，因此客户端的操作大大简化
 * */
public class Client {
    private static Originator o;
    private static MementoIF memento;

    public static void main(String[] args) {
        o = new Originator();
        //修改状态
        o.changeState("State 1");
        //创建备忘录
        memento = o.createMemento();
        //修改状态
        o.changeState("State 2");
        //按照备忘录恢复对象的状态
        o.restoreMemento(memento);
    }
}
