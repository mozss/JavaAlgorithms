package com.mozss.algorithms.leetcode.binary_search;

/**
 * @author mozss
 * @create 2019-09-06 8:28
 */
/*
 *冬季来临，你的任务是设计一个有固定加热半径的供暖器向所有的房屋供暖。
 * 现在，给出位于一条水平线上的房屋和供暖器的位置，找到可以覆盖所有房屋的最小加热半径。
 * 所以，你的输入将是房屋和供暖器的位置，你讲输出供暖的最小加热半径。
 *
 * 说明：
 * 1.给出的房屋和供暖器的书面是非负数且不会超过25000;
 * 2.给出的房屋和供暖器的位置均是非负数且不会超过10^9；
 * 3.只要房屋位于供暖器的半径内（包括在边缘上），它就可以得到供暖；
 * 4.所有供暖器都遵循你的半径标准，加热的半径也一样
 *
 * 示例1：
 * 输入：[1,2,3],[2]
 * 输出：1
 * 解释：仅在位置2上有一个供暖器，如果我们将加热半径设为1，那么所有房屋就能得到供暖
 *
 * 示例2：
 * 输入：[1,2,3,4],[1,4]
 * 输出：1
 * 解释：在位置1和4上有两个供暖器，我们需要将加热半径设为1，这样所有房屋就能得到供暖。
 * */
public class No_475 {
    public int findRadius(int[] houses, int[] heaters) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < houses.length; i++) {
            int max = Integer.MAX_VALUE;
            for (int j = 0; j < heaters.length; j++) {
                max = Math.min(max, Math.abs(houses[i] - heaters[j]));
            }
            res = Math.max(res, max);
        }
        return res;

    }


}
