package com.mozss.basic.algorithms.sort.tjj;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    private static int[] bucketSort(int[] arr) {

        // 计算最大值与最小值
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        // 计算桶的数量
        int bucketNum = (max - min) / arr.length + 1;
        ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketNum);
        for (int i = 0; i < bucketNum; i++) {
            bucketArr.add(new ArrayList<Integer>());
        }

        // 将每个元素放入桶
        for (int i = 0; i < arr.length; i++) {
            int num = (arr[i] - min) / (arr.length);
            bucketArr.get(num).add(arr[i]);
        }
        // 对每个桶进行排序
        for (int i = 0; i < bucketArr.size(); i++) {
            Collections.sort(bucketArr.get(i));
        }
        // 将桶中的元素赋值到原序列
        int index = 0;
        for (int i = 0; i < bucketArr.size(); i++) {
            for (int j = 0; j < bucketArr.get(i).size(); j++) {
                arr[index++] = bucketArr.get(i).get(j);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {100, 23, 256, 987, 954, 45, 123, 356, 378,};
        a = BucketSort.bucketSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
