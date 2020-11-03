package com.mozss.basic.algorithms.leetcode.binary_search;

/**
 * @author mozss
 * @create 2019-09-05 21:21
 */
/*
 *69.x的平方根
 *
 * 实现int sqrt(int x)函数
 * 计算并返回x的平方根，其中x是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * 示例1：
 * 输入：4
 * 输出：2
 *
 * 示例2：
 * 输入：8
 * 输出：2
 * 说明: 8 的平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。
 *
 * */
public class No_69 {
    public int mySqrt(int x) {
        long t = x;
        t = 0x5f3759df - (t >> 1);
        while (!(t * t <= x && (t + 1) * (t + 1) > x)) {
            t = (x / t + t) / 2;
        }
        return (int) t;
    }

    public int mySqrt_02(int x) {
        int left = 1, right = ((x >> 1) + 1);
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (mid > (Integer.MAX_VALUE / mid)) {
                right = mid - 1;
                continue;
            }
            int result = mid * mid;
            if (result == x) {
                return mid;
            } else if (result > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (left * left == x) {
            return left;
        } else {
            return left - 1;
        }


    }
}
