package com.mozss.algorithms.leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mozss
 * @create 2019-09-06 9:45
 */
/*
 * 771.宝石与石头
 *
 * 给定字符串J代表石头中宝石的类型，和字符串s代表你拥有的石头。
 * S中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *
 * J中的字母不重复，J和S中的所有字符都是字母，字母区分大小写，因此"a"和"A"是不同类型的石头
 *
 * 示例1：
 * 输入：J = "aA" S = "aAAbbbb"
 * 输出：3
 *
 * 示例2：
 * 输入：J = "z" S = "ZZ"
 * 输出：0
 *
 * 注意：
 * S和J最多含有50个字母
 * J中字符不重复
 *
 * */
public class No_771 {
    public int numJewelsInstones(String J, String S) {
        int num = 0;
        char[] dim = new char[J.length()];
        for (int i = 0; i < J.length(); i++) {
            char c = J.charAt(i);
            dim[i] = c;
        }
        for (int i = 0; i < S.length(); i++) {
            for (int i1 = 0; i1 < dim.length; i1++) {
                if (S.charAt(i) == dim[i1]) {
                    num++;
                }
            }
        }
        return num;
    }

    public int numJeweInStones_02(String J, String S) {
        //判断J和S的长度是否大于50
        if (J.length() > 50 || S.length() > 50) return -1;
        char[] j = J.toCharArray();//将J转换成char数组
        //创建Set集合，用于去除j数组中的重复数据
        Set<Character> jset = new HashSet<Character>();
        for (int i = 0; i < j.length; i++) {
            jset.add(j[i]);
        }
        int count = 0;
        char[] s = S.toCharArray();
        for (int i = 0; i < s.length; i++) {
            //比较
            if (jset.contains(s[i])) count++;
        }
        return count;
    }


}
