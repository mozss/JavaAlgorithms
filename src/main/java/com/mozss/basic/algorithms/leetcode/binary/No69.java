package com.mozss.basic.algorithms.leetcode.binary;

/**
 * @author mozss
 * @create 2019-09-05 21:21
 */
public class No69 {
    /**
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @题目编号:   69
     * @题目名称:   x的平方根
     * @知识考察:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @题目描述:   实现int sqrt(int x)的函数
     *             计算并返回x的平方根，其中x是非负整数
     *             由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @输入Input：   8
     * @输出Output:   2 （说明：8的平方根是2.82842...，小数部分将被舍去）
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @解题思路:
     * @题目总结:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     **/
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
    
    public static void main(String[] args) {
        int x = 10;
        No69 no69 = new No69();
        System.out.println("方法一的值是:" + no69.mySqrt(x));
        System.out.println("方法二的值是:" + no69.mySqrt_02(x));
    }
}
