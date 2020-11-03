package com.mozss.basic.patterns.behavior.memento.multiple_checkpoints;


import java.util.Enumeration;
import java.util.Vector;

/**
 * @author mozss
 * @create 2019-10-27 8:15
 */

public class Originator {
    private Vector states;
    private int index;

    /*
     * 构造函数
     * */
    public Originator() {
        states = new Vector();
        index = 0;
    }

    /*
     * 工厂方法，返还一个新的备忘录对象
     * */
    public Memento createMemento() {
        return new Memento(states, index);
    }

    /*
     * 将发起人恢复到备忘录对象记录的状态上
     * */
    public void restoreMemento(Memento memento) {
        states = memento.getStates();
        index = memento.getIndex();
    }

    /*
     * 状态的赋值方法
     * */
    public void setState(String state) {
        this.states.addElement(state);
        index++;
    }

    /*
     * 辅助方法，打印出所有的状态
     * */
    public void printStates() {
        System.out.println("Total number of states:" + index);
        for (Enumeration e = states.elements(); e.hasMoreElements(); ) {
            System.out.println(e.nextElement());
        }
    }


}
