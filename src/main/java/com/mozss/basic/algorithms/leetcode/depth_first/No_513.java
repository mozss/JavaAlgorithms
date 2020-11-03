package com.mozss.basic.algorithms.leetcode.depth_first;

/**
 * @author mozss
 * @create 2019-09-06 15:16
 */
/*
* 513.找左下角的值
* 给定一个二叉树，在树的最后一行找到最左边的值。

示例 1:
输入:
    2
   / \
  1   3
输出:
1

示例 2:
输入:
        1
       / \
      2   3
     /   / \
    4   5   6
       /
      7
输出:
7

注意: 您可以假设树（即给定的根节点）不为 NULL。
* */
public class No_513 {
    /*
     * 定义二叉树的节点
     * public class TreeNode{
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x){ val = x;}
     * }
     *
     * */
/*
    private int preLayer;
    private int value;

    public int findBottomLeftValue(TreeNode root){
        preLayer = -1;
        travelsal(root,0);
        return value;
    }

    private void travelsal(TreeNode node,int preLayer){
        if(node == null){
            return;
        }
        if (layer > preLayer){
            preLayer = layer;
            value = node.val;
        }
        layer++;
        travelsal(node.left,layer);
        travelsal(node.right,layer);
    }
*/


}
