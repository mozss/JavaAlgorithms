package com.mozss.basic.patterns.behavior.strategy.demo_02;

/**
 * @author mozss
 * @create 2019-10-16 9:46
 */
/*
 * 具体折扣类
 * */
public class FlatRateStrategy extends DiscountStrategy {
    private double price = 0;
    private int copies = 0;
    private double amount;

    /*
     * 构造函数
     * */
    public FlatRateStrategy(double price, int copies) {
        this.price = price;
        this.copies = copies;
    }

    /*
     * 策略方法
     * */
    @Override
    public double calculateDiscount() {
        return copies * amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
