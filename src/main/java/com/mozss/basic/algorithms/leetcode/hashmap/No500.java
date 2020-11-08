package com.mozss.basic.algorithms.leetcode.hashkeyMap;


import java.util.ArrayList;

/**
 * @author mozss
 * @create 2019-09-06 10:09
 */

public class No500 {
    /*
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目名称:   500.键盘同一行
     * 知识考察:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目描述:   给定一个单词类表,只返回可以在键盘同一行打印出来的单词
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * eg 1>:
     * 输入Input:    ["hello","Alaska","Dad","Peace"]
     * 输出Output:   ["Alaska","Dad"]
     * 说明:    1.可以重复使用键盘上的同一字符
     *          2.你可以假设输入的字符串将只包括字符
     * eg 2>:
     * 输入Input:
     * 输出Output:
     * 说明:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 解题思路:
     * 题目总结:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */
    
    public String[] findWords(String[] words) {
        //定义键盘
        String[] lines = new String[3];
        lines[0] = "qwertyuiop";
        lines[1] = "asdfghjkl";
        lines[2] = "zxcvbnm";
        int[] keyMap = new int[26];
        for (int i = 0; i < lines.length; i++) {
            char[] chars = lines[i].toCharArray();
            for (char chr : chars) {
                keyMap[chr - 'a'] = i;
            }
        }
        ArrayList<String> result = new ArrayList<>();
        for (String word : words) {
            boolean isInline = true;
            String aWord = word.toLowerCase();
            char[] tmp = aWord.toCharArray();
            for (int i = 1; i < tmp.length; ++i) {
                if (keyMap[tmp[i] - 'a'] != keyMap[tmp[i - 1] - 'a']) {
                    isInline = false;
                    break;
                }
            }
            if (isInline) {
                result.add(word);
            }
        }
        return result.toArray(new String[result.size()]);
    }
    
    public static void main(String[] args) {
        No500 no500 = new No500();
        String[] intputStr = {"hello","Alaska","Dad","Peace" };
        for (String n : no500.findWords(intputStr)) {
            System.out.println(n);
        }
    }
}
