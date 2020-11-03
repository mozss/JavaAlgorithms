package com.mozss.basic.patterns.structural.adapter.class_adapter;

/**
 * @author mozss
 * @create 2019-09-16 16:29
 */

public class Adapter extends Adaptee implements Target {
    /*
     * 由于源类没有方法sampleOperation2,因此适配器补充上这个方法
     * */
    @Override
    public void sampleOperation2() {

    }
}
