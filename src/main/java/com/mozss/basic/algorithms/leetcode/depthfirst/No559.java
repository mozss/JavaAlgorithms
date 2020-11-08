package com.mozss.basic.algorithms.leetcode.depthfirst;

/**
 * @author mozss
 * @create 2019-09-06 15:08
 */

public class No559 {
	/*
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * 题目名称:   559.N叉树的最大深度
	 * 知识考察:
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * 题目描述:   给定一个N叉树,求其最大的深度
	 *             最大深度是指从根节点到最远叶子节点的最长路径上的节点总数
	 *
	 *             说明:
	 *                  1.树的深度不会超过1000
	 *                  2.树的节点不会超过5000
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * eg 1>:
	 * 输入Input:
	 * 输出Output:
	 * 说明:
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
