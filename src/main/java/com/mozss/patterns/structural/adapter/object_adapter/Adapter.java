package com.mozss.patterns.structural.adapter.object_adapter;

/**
 * @author mozss
 * @create 2019-09-16 16:39
 */

public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        super();
        this.adaptee = adaptee;
    }

    /*
     * 源类有方法sampleOperation1
     * 因此适配器类直接委派即可
     * */
    @Override
    public void sampleOperation1() {
        adaptee.sampleOperation1();
    }

    /*
     * 源类没有方法sampleOperation2
     * 因此由适配类补充此方法
     * */
    @Override
    public void sampleOperation2() {
        //write your code here
    }
}
