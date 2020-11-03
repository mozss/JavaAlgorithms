package com.mozss.basic.patterns.behavior.command.stock_demo;

/**
 * @author mozss
 * @create 2019-10-26 21:23
 */

public class Broker {
    private Command buyCommand, sellCommand;

    /*
     * 构造函数
     * */
    public Broker(Command buy, Command sell) {
        this.buyCommand = buy;
        this.sellCommand = sell;
    }

    /*
     * 行动方法
     * */
    void buy() {
        buyCommand.execute();
    }

    /*
     * 行动方法
     * */
    void sell() {
        sellCommand.execute();
    }
}
