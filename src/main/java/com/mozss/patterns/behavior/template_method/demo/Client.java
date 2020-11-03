package com.mozss.patterns.behavior.template_method.demo;


/**
 * @author mozss
 * @create 2019-09-24 21:55
 */

public class Client {
    private static Account acct = null;

    public static void main(String[] args) {
        acct = new MoneyMarketAccount();
        System.out.println("Interest from Money Market account" + acct.calulateInterest());
        acct = new CDAccount();
        System.out.println("Interest from CD account" + acct.calulateInterest());
    }
}
