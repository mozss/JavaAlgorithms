package com.mozss.algorithms.leetcode.binary_search;

/**
 * @author mozss
 * @create 2019-09-05 20:53
 */
/*
*给定两个整数，被除数dividend和除数divisor,将两个数字相除，要求不使用乘法，除法，
* 和mod运算符。
* 返回被除数dividend除以除divisor得到的商。
*
* 示例1：
* 输入：dividend = 10;divisor = 3;
* 输出：3
*
* 输入: dividend = 7, divisor = -3
* 输出: -2
*
* 说明:

被除数和除数均为 32 位有符号整数。
除数不为 0。
假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。
本题中，如果除法结果溢出，则返回 231 − 1。
* */

public class No_29 {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (dividend == Integer.MAX_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean negative;
        negative = (dividend ^ divisor) < 0; //用异或来计算符号是否相异
        long t = Math.abs((long) dividend);
        long d = Math.abs((long) dividend);
        int result = 0;
        for (int i = 0; i >= 0; i++) {
            if ((t >> i) >= d) { //找出足够大的数2^n*divisor
                result += 1 << i; //将结果加上2^n
                t -= d << i;
            }
        }
        return negative ? -result : result; //符号相异取反
    }


}
