package com.mozss.algorithms.theory.recursive;

/**
 * @author mozss
 * @create 2019-11-08 17:40
 */
/*
 * Title: 回文字符串的判断
 * Description: 回文字符串就是正读倒读都一样的字符串。如”98789”, “abccba”都是回文字符串
 * 两种解法：
 * 递归判断；
 * 循环判断；
 * */
public class PalindromeString {
    /**
     * @param s
     * @return
     * @description 递归判断一个字符串是否是回文字符串
     * @author rico
     * @created 2017年5月10日 下午5:45:50
     */
    public static boolean isPalindromeStringByRecursive(String s) {
        int start = 0;
        int end = s.length() - 1;
        if (end > start) {   // 递归终止条件:两个指针相向移动，当start超过end时，完成判断
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            } else {
                // 递归调用，缩小问题的规模
                return isPalindromeStringByRecursive(s.substring(start + 1).substring(0, end - 1));
            }
        }
        return true;
    }

    /**
     * @param s
     * @return
     * @description 循环判断回文字符串
     * @author rico
     */
    public static boolean isPalindromeStringByCycle(String s) {
        char[] str = s.toCharArray();
        int start = 0;
        int end = str.length - 1;
        while (end > start) {  // 循环终止条件:两个指针相向移动，当start超过end时，完成判断
            if (str[end] != str[start]) {
                return false;
            } else {
                end--;
                start++;
            }
        }
        return true;
    }
}
