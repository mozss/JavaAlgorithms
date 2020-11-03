package com.mozss.patterns.behavior.command.stock_demo;

/**
 * @author mozss
 * @create 2019-10-26 21:21
 */

public class SellStockCommand implements Command {
    private StockMarket stock;
    /*
     * 构造函数
     * */

    public SellStockCommand(StockMarket stock) {
        this.stock = stock;
    }

    /*
     * 执行方法
     * */
    @Override
    public void execute() {
        stock.sell();
    }
}
