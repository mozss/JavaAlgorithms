package com.mozss.basic.algorithms.leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mozss
 * @create 2019-09-06 9:45
 */
public class No771 {
    /*
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目名称:   771.宝石与石头
     * 知识考察:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目描述:   给定字符串J代表石头中宝石的类型,和字符串s代表你拥有的石头
     *             S中每个字符串代表了一种你拥有的石头的类型,你你想知道你拥有的石头中有多少是宝石
     *
     *             J中的字母不重复,J和S中的所有字符都是字母,字母大小写区分,比如'a'和'A'是不同类型
     *             的石头
     *
     *             注意:S和J最多含有50个字母,J中字符不重复
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * eg 1>:
     * 输入Input:    J = "aA" S = "aAAbbbbb"
     * 输出Output:   3
     * 说明:
     *
     * eg 2>:
     * 输入Input:    J = "z"  S = "ZZ"
     * 输出Output:   0
     * 说明:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 解题思路:
     * 题目总结:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */
    public int numJeweInStones(String strJ, String strS) {
        int num = 0;
        char[] dim = new char[strJ.length()];
        for (int i = 0; i < strJ.length(); i++) {
            char c = strJ.charAt(i);
            dim[i] = c;
        }
        for (int i = 0; i < strS.length(); i++) {
            for (int i1 = 0; i1 < dim.length; i1++) {
                if (strS.charAt(i) == dim[i1]) {
                    num++;
                }
            }
        }
        return num;
    }

    public int numJeweInStones02(String strJ, String strS) {
        //判断J和S的长度是否大于50
        int length = 50;
        if(strJ.length() > length || strS.length() > length) {
            return -1;
        }
        //将J转换成char数组
        char[] j = strJ.toCharArray();
        //创建Set集合，用于去除j数组中的重复数据
        Set<Character> jset = new HashSet<Character>();
        for (int i = 0; i < j.length; i++) {
            jset.add(j[i]);
        }
        int count = 0;
        char[] s = strS.toCharArray();
        for (int i = 0; i < s.length; i++) {
            //比较
            if(jset.contains(s[i])){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        String inputJ = "aA";
        String inputS = "aaaaAAAbb";
        No771 no771 = new No771();
        System.out.println("方法一的结果: " + no771.numJeweInStones(inputJ,inputS));
        System.out.println("方法二的结果: " + no771.numJeweInStones02(inputJ,inputS));
        
    }

}
