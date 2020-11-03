package com.mozss.basic.patterns.behavior.strategy.demo_02;

/**
 * @author mozss
 * @create 2019-10-16 9:43
 */
/*
 * 具体折扣类，该类是折扣类型等级结构中的成员，作为抽象类DiscountSrategy的子类，实现calculateDiscount方法
 * */
public class NoDiscountStrategy extends DiscountStrategy {
    private double price = 0;
    private int copies = 0;

    /*
     * 构造函数
     * */
    public NoDiscountStrategy(double price, int copies) {
        this.price = price;
        this.copies = copies;
    }

    /*
     *策略方法
     * */
    @Override
    public double calculateDiscount() {
        //表示没有折扣
        return 0;
    }
}
