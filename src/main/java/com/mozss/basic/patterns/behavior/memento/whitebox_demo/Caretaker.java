package com.mozss.basic.patterns.behavior.memento.whitebox_demo;

/**
 * @author mozss
 * @create 2019-10-27 7:11
 */
/*
 * 负责人角色代码
 * */
public class Caretaker {
    private Memento memento;

    /*
     * 备忘录的取值和赋值方法
     * */
    public Memento getMemento() {
        return this.memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    /*
     * 以下部分的实现参考黑箱备忘录的实现
     * */

/*    public void saveMemento(Memento memento) {
    }

    public Memento retrieveMemento() {
    }*/
}
