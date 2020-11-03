package com.mozss.patterns.creational.builder.simple_demo;

/**
 * @author mozss
 * @create 2019-10-30 13:53
 */

abstract public class Builder {
    /*
     * 产品零件建造方法
     * */
    public abstract void buildPart1();

    /*
     * 产品零件建造方法
     * */
    public abstract void buildPart2();

    /*
     * 产品的返回方法
     * */
    public abstract Product retrieveResult();
}
