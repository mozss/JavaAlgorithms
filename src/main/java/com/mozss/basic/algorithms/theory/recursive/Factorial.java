package com.mozss.basic.algorithms.theory.recursive;

/**
 * @author mozss
 * @create 2019-11-08 13:29
 */
/*
 * 阶乘问题：
 *
 * 求一个数的阶乘
 * 1.当问题描述为： n! = n*(n-1)*(n-2)*......1，我们想到使用for循环来描述这个解题的过程；
 * 2.当问题描述为：n! = n*(n-1)！，我们想到使用递归来描述这个解题的过程。
 *
 * */
public class Factorial {
    /*
     * 1.for循环
     * */
    public static int getFactorialByFor(int n) {
        int temp = 1;
        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                temp = temp * i;
            }
        } else {
            return -1;
        }
        return temp;
    }

    /*
     * 2.使用递归（recursive）
     * */
    public static int getFactorialByRecursive(int n) {
        if (n >= 0) {
            if (n == 0) {
                return 1;
            } else {
                int temp = n * getFactorialByRecursive(n - 1);
                return temp;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int m, n;
        System.out.println(getFactorialByFor(5));
        System.out.println(getFactorialByRecursive(10));
    }


}
