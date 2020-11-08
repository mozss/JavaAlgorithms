package com.mozss.basic.algorithms.leetcode.greedy;

/**
 * @author mozss
 * @create 2019-09-06 16:46
 */

public class No122 {
    /*
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目名称:   122.买卖股票的最佳时间
     * 知识考察:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目描述:   给定一个数组,它的第i个元素是一只给定股票第i天的价格
     *             设计一个算法来计算你能获取的最大利润,你可以尽可能完成更多的交易(多次买卖一次股票)
     *
     *             注意: 你不能同时参加多笔交易(你必须在再次购买的时候卖掉之前的股票)
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * eg 1>:
     * 输入Input:    [7,1,5,3,6,4]
     * 输出Output:   7
     * 说明:     在第二天(价格为1)的时候买入,第三天卖出(价格为5),这笔交易所能获得的利润是5-1=4;
     *            随后在第四条(价格为3)的时候买入,在第五天(价格为6)的时候卖出,这笔交易能获得的利润6-3=3;
     *            总利润: 4 + 3 =7
     *
     * eg 2>:
     * 输入Input:    [7,6,4,3,1]
     * 输出Output:   0
     * 说明:     在这种情况下,没有交易,利润为0
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 解题思路:
     * 题目总结:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */
    public int maxProfit(int[] prices) {
        int ans = 0;
        int intN = prices.length;
        for (int i = 0; i < intN - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                int temp = prices[i + 1] - prices[i];
                ans += temp;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] pricesLine = {7,1,5,3,6,4};
        System.out.println(new No122().maxProfit(pricesLine));
    }
}
