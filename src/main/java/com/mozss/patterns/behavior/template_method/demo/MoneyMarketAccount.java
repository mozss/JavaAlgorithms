package com.mozss.patterns.behavior.template_method.demo;


/**
 * @author mozss
 * @create 2019-09-24 21:52
 */

public class MoneyMarketAccount extends Account {
    /*
     * 基本方法在这里实现
     * */
    protected String doCalculateAccountType() {
        return "Money Market";
    }

    /*
     * 基本方法在这里实现
     * */
    protected double doCalculateInterestRate() {
        return 0.0045D;
    }
}
