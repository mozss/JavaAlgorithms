package com.mozss.basic.patterns.behavior.iteratior.balckbox_demo;


/**
 * @author mozss
 * @create 2019-10-28 13:55
 */

abstract public class Aggregate {
    /*
     * 返回一个迭代子对象
     * */
    public abstract Iterator createIterator();
}
