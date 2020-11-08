package com.mozss.basic.algorithms.leetcode.binary;

/**
 * @author mozss
 * @create 2019-09-05 20:53
 */

public class No29 {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        No29 no29 = new No29();
        System.out.println(no29.divide(dividend, divisor));
    }

    /*
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目名称: 两个整数相除，返回商
     * 知识考察: * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目描述: 给定两个整数，被除数dividend和除数divisor，将两个数字相除，要求不使用除法，
     * 乘法，和mod运算符。返回dividend和divisor想除得到的商。
     * <p>
     * 说明：被除数和除数均为32位有符号整数。
     * 除数不能为0,假设我们的环境只能存储32位有符号整数，其数值的范围是[-231,231-1],
     * 如果，在本题目中，除法的结果溢出，则放回321-1
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 输入Input: dividend = 10 , divisor = 3;
     * 输出Output: 3
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 解题思路:
     * 题目总结: * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */
    
    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (dividend == Integer.MAX_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int result = 0;
        //用异或来计算符号是否相异
        boolean negative = (dividend ^ divisor) < 0;
        long t = Math.abs((long) dividend);
        long d = Math.abs((long) dividend);
        for (int i = 0; i >= 0; i++) {
            //找出足够大的数2^n*divisor
            if ((t >> i) >= d) {
                //将结果加上2^n
                result += 1 << i;
                t -= d << i;
            }
        }
        //符号相异取反
        return negative ? -result : result;
    }
}
