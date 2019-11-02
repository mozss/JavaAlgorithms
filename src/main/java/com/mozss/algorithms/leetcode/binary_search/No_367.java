package com.mozss.algorithms.leetcode.binary_search;

/**
 * @author mozss
 * @create 2019-09-05 23:49
 */

/*
 *367.有效的完全平方数
 *
 * 给定一个正整数num,编写一个函数，如果num是一个完全平方数，则返回True,否则返回False
 *
 * 说明:不要使用任何内置的库函数，如：sqrt
 *
 * 示例1：
 * 输入：16
 * 输出：True
 *
 * 示例2：
 * 输入14
 * 输出False
 * */
public class No_367 {
    public boolean isPerfectSquare(int num) {
        int l = 0;
        int r = num;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            //反向算，防止乘法溢出
            if (mid == (num * 1.0 / mid))
                return true;
            else if (mid > (num * 1.0 / mid))
                r = mid - 1;
            else
                l = mid + 1;
        }
        return false;
    }


}
