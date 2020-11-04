package com.mozss.basic.algorithms.leetcode.array;

/**
 * @author mozss
 * @create 2019-09-06 16:18
 */

public class No11 {
    /**
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @题目编号:   11
     * @题目名称:   盛最多水的容器
     * @知识考察:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @题目描述:   给定n个非负数 a1,a2,...,an,每个数代表坐标中的一个点（i,ai）.
     *             在坐标内画n条垂直线，垂直线i的两个端点分别为（i，ai）和（i,0）
     *             找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @输入Input:    [1,8,6,2,5,4,8,3,7]
     * @输出Output:   49
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @解题思路:
     * @题目总结:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     **/
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        No11 no11 = new No11();
        System.out.println(no11.maxArea(height));
    }
    public int maxArea(int[] height){
        int maxarea = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j){
            maxarea = Math.max(maxarea,Math.min((height[i]),height[j]*(j-1)));
            if (height[i] < height[j]){
                i++;
            }else {
                j--;
            }
        }
        return maxarea;
    }
}
