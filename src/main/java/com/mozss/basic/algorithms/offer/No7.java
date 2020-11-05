package com.mozss.basic.algorithms.offer;

import java.util.HashMap;
import java.util.Map;

/*
 * 重建二叉树
 * */
public class No7 {
    private final Map<Integer, Integer> indexForInOrders = new HashMap<>();

    /*
     * 缓存中遍历数组每个值对应的索引
     * */

    /*
     * 二叉树的结构
     * */
    static class BinaryTreeNode {
        public int value;
        public BinaryTreeNode leftNode;
        public BinaryTreeNode rightNode;

        public BinaryTreeNode() {

        }

        public BinaryTreeNode(int value) {
            this.value = value;
            this.leftNode = null;
            this.rightNode = null;
        }
    }


}
