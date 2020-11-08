package com.mozss.basic.algorithms.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mozss
 * @create 2019-09-06 12:27
 */
public class No447 {
    /*
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目名称:   447.回旋镖的数量
     * 知识考察:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目描述:   给定平面上n对不同的点,"回旋镖"是由点表示的元组(i,j,k),其中i和j之间的距离
     *             与j和k之间的距离是相同的.
     *             请找到所有回旋镖的数量,你可以假设n最大为500,所有的点在封闭坐标[-10000,10000]
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * eg 1>:
     * 输入Input:    [[0,0],[1,0],[2,0]]
     * 输出Output:   2
     * 说明:     两个回旋镖为[[1,0],[0,0],[2,0]]和[[1,0],[2,0],[0,0]]
     *
     * eg 2>:
     * 输入Input:
     * 输出Output:
     * 说明:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 解题思路:
     * 题目总结:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */
/*
    public int numberOfBoomeranges(int[][] points){
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            int[] center = points[i];
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int j = 0; j <points.length ; j++) {
                if(i == j) {
                    continue;
                    //计算points[j]到center的距离
                    int distance =
                            ((center[0] - points[j][0]) * (center[0] - points[j][0])) + ((center[1] - points[j][1]) * (center[1] - points[j][1]));
                    map.put(distance,map.getOrDefault(distance,0) + 1);
                }
                //判断组合的可能性
                for (int key : map.keySet()) {
                    res += map.get(key) * (map.get(key) - 1);
                }
            }
        }
        return res;
    }
*/
}

