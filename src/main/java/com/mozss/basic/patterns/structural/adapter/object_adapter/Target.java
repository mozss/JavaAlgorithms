package com.mozss.basic.patterns.structural.adapter.object_adapter;

/**
 * @author mozss
 * @create 2019-09-16 16:37
 */

public interface Target {
    /*
     * 这是源类也有的方法sampleOperation1
     * */
    void sampleOperation1();

    /*
     * 这是源类中没有的方法sampleOperation2
     * */
    void sampleOperation2();
}
