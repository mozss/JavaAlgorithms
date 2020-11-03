package com.mozss.patterns.behavior.iteratior.whitebox_demo;

/**
 * @author mozss
 * @create 2019-10-28 13:36
 */

public interface Iterator {
    /*
     * 移动到第一个元素
     * */
    void first();

    /*
     * 移动到下一个元素
     * */
    void next();

    /*
     * 是否是最后一个元素
     * */
    boolean isDone();

    /*
     * 返回当前元素
     * */
    Object currentIterator();
}
