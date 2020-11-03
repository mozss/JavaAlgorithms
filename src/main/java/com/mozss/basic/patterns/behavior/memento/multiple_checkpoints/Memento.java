package com.mozss.basic.patterns.behavior.memento.multiple_checkpoints;

import java.util.Vector;

/**
 * @author mozss
 * @create 2019-10-27 8:24
 */
/*
 * 备忘录的构造函数克隆了传入的states,然后将克隆存入到备忘录对象内部，这是一个重要的细节。因为不这样的话，将会造成客户端和备忘录
 * 对象持有对同一个Vector对象的引用，也可以同时修改这个Vector对象，会造成系统崩溃。
 * */
public class Memento {
    private Vector states;
    private int index;

    /*
     * 构造函数
     * */
    public Memento(Vector states, int index) {
        this.states = (Vector) states.clone();
        this.index = index;
    }

    /*
     * 状态的取值方法
     * */
    Vector getStates() {
        return states;
    }

    /*
     * 检查点指数的取值方法
     * */
    int getIndex() {
        return this.index;
    }
}
