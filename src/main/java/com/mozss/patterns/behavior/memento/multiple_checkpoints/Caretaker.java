package com.mozss.patterns.behavior.memento.multiple_checkpoints;

import java.util.Vector;

/**
 * @author mozss
 * @create 2019-10-27 8:29
 */
/*
 * 负责人角色可以根据检查点指数index来恢复发起人角色的状态，也可以根据检查点指数index来取消一个检查点。
 * */
public class Caretaker {
    private Originator o;
    private Vector mementos = new Vector();
    private int current;

    /*
     * 构造函数
     * */
    public Caretaker(Originator o) {
        this.o = o;
        current = 0;
    }

    /*
     * 创建一个新的检查点
     * */
    public int createMemento() {
        Memento memento = o.createMemento();
        mementos.addElement(memento);
        return current++;
    }

    /*
     * 将发起人恢复到某个检查点
     * */
    public void restoreMemento(int index) {
        Memento memento = (Memento) mementos.elementAt(index);
        o.restoreMemento(memento);
    }

    /*
     * 将检查点删除
     * */
    public void removeMemento(int index) {
        mementos.removeElementAt(index);
    }
}
