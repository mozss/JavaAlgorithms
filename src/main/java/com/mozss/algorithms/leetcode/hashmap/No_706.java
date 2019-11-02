package com.mozss.algorithms.leetcode.hashmap;

/**
 * @author mozss
 * @create 2019-09-06 11:39
 */
/*
 * 706.设计哈希映射
 * 不使用任何内建的哈希表库设计一个哈希映射表
 * 具体地说，你的设计应该包含以下的功能
 * - put(key,value):向哈希映射表中插入（键，值）的数值对，假如键对应的值已经存在，
 *   更新这个值。
 * - get(key): 返回给定的键对应的值，如果映射中不含有这个键值，返回-1
 * - remove(key): 如果这个映射中存在这个键，删除这个数值对
 *
 * 示例：
 *MyHashMap hashMap = new MyHashMap();
 *hashMap.put(1, 1);
 *hashMap.put(2, 2);
 *hashMap.get(1);            // 返回 1
 *hashMap.get(3);            // 返回 -1 (未找到)
 *hashMap.put(2, 1);         // 更新已有的值
 *hashMap.get(2);            // 返回 1
 *hashMap.remove(2);         // 删除键为2的数据
 *hashMap.get(2);            // 返回 -1 (未找到)
 *
 *
 * 注意:
 * 所有的值都在[1,1000000]的范围内
 * 操作的总数目在[1,10000]范围内
 * 不要使用内建的哈希库
 * */
public class No_706 {
    private Integer[] backArr;
    private static final int DEFAULT_VOLUME = 100000;

    //构造函数
    public No_706() {
        backArr = new Integer[DEFAULT_VOLUME];
    }

    public void put(int key, int value) {
        backArr[key % DEFAULT_VOLUME] = value;
    }

    public int get(int key) {
        return backArr[key % DEFAULT_VOLUME] != null ? backArr[key % DEFAULT_VOLUME] : 1;
    }

    public void remove(int key) {
        backArr[key % DEFAULT_VOLUME] = null;
    }


}
