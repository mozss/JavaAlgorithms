package com.mozss.basic.patterns.behavior.strategy.demo_02;

/**
 * @author mozss
 * @create 2019-10-16 9:33
 */
/*
 * 本类是抽象类，而一个抽象类是不能实例化的，因此本类给出的接口是供具体子类实现的。可以看出，在使用具体折扣类时，客户端应当调用
 * 构造函数并且传入图书的单价，购买的册数，然后调用calculateDiscount()方法得到折扣总额。
 * */
abstract public class DiscountStrategy {
    private double price = 0;
    private int copies = 0;

    /*
     * 策略方法
     * */
    public abstract double calculateDiscount();

    /*
     * 构造函数
     * */
    public DiscountStrategy() {
        this.price = price;
        this.copies = copies;
    }

}
