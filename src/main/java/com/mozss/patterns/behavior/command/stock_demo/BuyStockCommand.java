package com.mozss.patterns.behavior.command.stock_demo;

/**
 * @author mozss
 * @create 2019-10-26 21:18
 */

public class BuyStockCommand implements Command {
    private StockMarket stock;
    /*
     * 构造函数
     * */

    public BuyStockCommand(StockMarket stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
