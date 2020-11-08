package com.mozss.basic.algorithms.leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mozss
 * @create 2019-09-06 11:29
 */

public class No575 {
    /**
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目名称:   575.分糖果
     * 知识考察:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目描述:   给定一个偶数长度的数组,其中不同的数字代表着不同的糖果,每一个数字代表一个糖果,
     *             你需要把这些糖果平均分给一个弟弟和一个妹妹,返回妹妹可以获得的最大糖果种类.
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * eg 1>:
     * 输入Input:    candies = [1,1,2,2,3,3]
     * 输出Output:   3
     * 说明:     一共有三种种类的糖果,每一种都有两个.最佳的分配方案是妹妹获得[1,2,3],弟弟获得[1,2,3]
     *            这样妹妹获得的种类最多.
     * eg 2>:
     * 输入Input:
     * 输出Output:
     * 说明:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 解题思路:
     * 题目总结:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */

    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int candy : candies) {
            set.add(candy);
        }
        if (set.size() >= candies.length / 2) {
            return candies.length / 2;
        }
        return set.size();
    }
    
    public static void main(String[] args) {
        int[] cndiesDemo = {1,1,2,2,3,3,4,5};
        System.out.println(new No575().distributeCandies(cndiesDemo));
    }
}
