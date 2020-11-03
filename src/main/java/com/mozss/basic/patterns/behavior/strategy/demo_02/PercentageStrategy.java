package com.mozss.basic.patterns.behavior.strategy.demo_02;

/**
 * @author mozss
 * @create 2019-10-16 9:56
 */
/*
 * 具体的折扣类
 * */
public class PercentageStrategy {
    private double precent = 0;
    private double price = 0;
    private int copies = 0;

    /*
     * 构造函数
     * */
    public PercentageStrategy(double price, int copies) {
        this.price = price;
        this.copies = copies;
    }

    public double getPrecent() {
        return precent;
    }

    public void setPrecent(double percent) {
        this.precent = percent;
    }

    /*
     * 策略方法
     * */
    public double calculateDiscount() {
        return copies * price * precent;
    }
}
