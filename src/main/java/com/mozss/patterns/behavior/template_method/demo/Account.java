package com.mozss.patterns.behavior.template_method.demo;

/**
 * @author mozss
 * @create 2019-09-24 21:39
 */
public abstract class Account {
    protected String accountNumber;

    /*
     * 默认构造函数
     * */
    public Account() {
        accountNumber = null;
    }

    /*
     * 构造函数
     * */
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /*
     * 模板方法，计算利息数额
     * */
    final public double calulateInterest() {
        double interestRate = doCalculateInterestRate();
        String accountType = doCalculateAccountType();
        double amount = calculateAmount(accountType, accountNumber);
        return amount * interestRate;
    }

    /*
     * 基本方法留给子类实现
     * */
    abstract protected String doCalculateAccountType();

    /*
     * 基本方法留给子类实现
     * */
    abstract protected double doCalculateInterestRate();

    /*
     * 基本方法，已经实现
     * */
    final public double calculateAmount(String accountType, String accountNumber) {
        //retrieve amount from database，这里可以直接读取数据库返回一个确定数额
        return 7243.00D;
    }


}
