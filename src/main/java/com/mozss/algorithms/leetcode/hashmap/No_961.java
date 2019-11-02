package com.mozss.algorithms.leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mozss
 * @create 2019-09-06 10:02
 */
/*
 * 961.重复N次的元素
 *
 * 在大小为2N的数组A中有N+1个不同的元素，其中有一个元素重复了N次，返回重复了N次的那个元素。
 * 示例1：
 * 输入：[1,2,3,3]
 * 输出：3
 *
 * 示例2：
 * 输入：[2,1,2,5,3,2]
 * 输出：2
 *
 * 示例3：
 * 输入：[5,1,5,2,5,3,5,4]
 * 输出：5
 *
 * 提示：
 *
 * 4 <= A.length <= 10000
 * 0 <= A[i] <10000
 * A.length为偶数
 *
 * */
public class No_961 {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>(A.length / 2 + 1);
        for (int i : A) {
            if (!set.add(i)) {
                return i;
            }
        }
        return 0;
    }


}
