package com.mozss.algorithms.offer;

import java.util.HashMap;
import java.util.Map;

/*
* 重建二叉树
* */
public class No7 {
    /*
    * 二叉树的结构
    * */
    static class BinaryTreeNode {
        public int value;
        public BinaryTreeNode leftNode;
        public BinaryTreeNode rightNode;

        public BinaryTreeNode(){

        }
        public BinaryTreeNode(int value){
            this.value = value ;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    /*
    * 缓存中遍历数组每个值对应的索引
    * */

    private Map<Integer,Integer> indexForInOrders = new HashMap<>();



}
