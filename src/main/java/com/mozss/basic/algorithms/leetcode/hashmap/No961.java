package com.mozss.basic.algorithms.leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mozss
 * @create 2019-09-06 10:02
 */

public class No961 {
    /**
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目名称:   961.重复N次的元素
     * 知识考察:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目描述:   在大小为2N的数组中A有N+1个不同的元素,其中有一个元素重复了N次,返回重复了N次的那个元素
     *
     *             提示:
     *                  1. 4 <= A.length <= 10000
     *                  2. 0 <= A[i] < 10000
     *                  3. A.length为偶数
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * eg 1>:
     * 输入Input:    [1,2,3,4]
     * 输出Output:   3
     * 说明:
     *
     * eg 2>:
     * 输入Input:    [5,1,5,2,5,3,5,4]
     * 输出Output:   5
     * 说明:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 解题思路:
     * 题目总结:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */
    public int repeatedNTimes(int[] intA) {
        Set<Integer> set = new HashSet<>(intA.length / 2 + 1);
        for (int i : intA) {
            if (!set.add(i)) {
                return i;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int[] intADemo = {5,1,5,2,5,3,5,4};
        No961 no961 = new No961();
        System.out.println(no961.repeatedNTimes(intADemo));
    }
}
