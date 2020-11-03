package com.mozss.patterns.behavior.memento.blackbox_demo;

/**
 * @author mozss
 * @create 2019-10-27 7:48
 */
/*
 * 负责人角色
 * */
public class Caretaker {
    private MementoIF memento;

    /*
     * 备忘录的取值方法
     * */
    public MementoIF retrieveMemento() {
        return this.memento;
    }

    /*
     * 备忘录的赋值方法
     * */
    public void saveMemento(MementoIF memento) {
        this.memento = memento;
    }
}
