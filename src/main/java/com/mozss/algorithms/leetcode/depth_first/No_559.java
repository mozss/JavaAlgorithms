package com.mozss.algorithms.leetcode.depth_first;

/**
 * @author mozss
 * @create 2019-09-06 15:08
 */
/*
 * 559.N叉树的最大深度
 *
 * 给定一个N叉树，求其最大深度
 * 最大深度是指从根节点都最远叶子节点的最长路径上的节点总数
 *
 * 说明：
 * 1.树的深度不会超过1000
 * 2.树的节点不会超过5000
 * */
public class No_559 {
    /*
     * 定义节点
     *class Node{
     *     public int val;
     *     public List<Node> children;
     *     public Node(){}
     *     public Node(int _val,list<Node> _children){
     *         val = _val;
     *         children = _children;
     *     }
     * }
     *
     * */
/*
    class Solution{
        public int maxDepth(Node root){
            int res = 0;
            if(root != null){
                int max = 0;
                for (Node p:root.children) {
                    int tmp = maxDepth(p);
                    max = Math.max(max,tmp);
                }
                res = max + 1;
            }
        return res;
        }

    }
*/


}
