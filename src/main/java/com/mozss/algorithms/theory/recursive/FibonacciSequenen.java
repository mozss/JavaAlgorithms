package com.mozss.algorithms.theory.recursive;

/**
 * @author mozss
 * @create 2019-11-08 17:25
 */
/*
 * 斐波那契数列
 * 1,1,2,3,5,8,13,21,34,...
 * f(n+1) = f(n-1)+ f(n)
 * */
public class FibonacciSequenen {
    /**
     * 递归实现
     *
     * @param n
     * @return
     */
    private static int fibonacci(int n) {
        //递归的终止条件
        if (n == 1 || n == 2) {
            //简单场景
            return 1;
        }
        //相同重复逻辑，缩小问题的规模
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * @description 对经典递归法的优化
     * 斐波那契数列如下：
     * 1,1,2,3,5,8,13,21,34,...
     * 那么，我们可以这样看：fib(1,1,5) = fib(1,2,4) = fib(2,3,3) = 5
     * 也就是说，以1,1开头的斐波那契数列的第五项正是以1,2开头的斐波那契数列的第四项，
     * 而以1,2开头的斐波那契数列的第四项也正是以2,3开头的斐波那契数列的第三项，
     * 更直接地，我们就可以一步到位：fib(2,3,3) = 2 + 3 = 5,计算结束。
     * 注意，前两个参数是数列的开头两项，第三个参数是我们想求的以前两个参数开头的数列的第几项。
     */
    private static int fibonacciBetter(int first, int second, int n) {
        if (n > 0) {
            //终止条件
            if (n == 1) {
                //简单场景
                return first;
            } else if (n == 2) {
                return second;
            } else if (n == 3) {
                return first + second;
            }
            //相同的逻辑，缩小子问题规模
            return fibonacciBetter(second, first + second, n - 1);
        }
        return -1;
    }
}
