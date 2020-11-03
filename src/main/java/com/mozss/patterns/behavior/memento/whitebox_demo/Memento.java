package com.mozss.patterns.behavior.memento.whitebox_demo;

/**
 * @author mozss
 * @create 2019-10-27 7:05
 */
/*
 * 备忘录角色代码
 * */
public class Memento {
    private String state;

    /*
     * 构造函数
     * */
    public Memento(String state) {
        this.state = state;
    }

    /*
     * 取值方法
     * */
    public String getState() {
        return this.state;
    }

    /*
     * 赋值方法
     * */
    public void setState(String state) {
        this.state = state;
    }
}
