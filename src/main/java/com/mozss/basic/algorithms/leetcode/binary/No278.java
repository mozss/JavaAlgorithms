package com.mozss.basic.algorithms.leetcode.binary;

/**
 * @author mozss
 * @create 2019-09-05 21:37
 */
/*
 * The isBadVersion API is defiend in the parent class VersionControl.
 *   boolean isBadVersion(int version);
 * */
/*

public class Solution extends VersionControl{

    public int firstBadVersion(int n){
        int left = 1,right = n,mid;
        while (left < right){
            //防止溢出
           mid = left + (right - left) / 2;
           if(firstBadVersion(mid)){
               right = mid;
           }else {
               left = mid + 1;
           }
        }
        return right;
    }
}
*/

public class No278 {
	/**
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * @题目名称:   278.第一个错误的版本
	 * @知识考察:
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * @题目描述:
	 *          你是产品经理，目前正在带领一个团队开发新的产品，不幸运的是，你的产品的最新版本没有
	 *          通过质量检测，由于每个版本都是基于之前的版本开发的，所以错误之后的版本都是错误的。
	 *
	 *          假设你有n个版本，[1,2,3,4,...,n],你想要找出导致之后所有版本出错的第一个错误的版本，
	 *          你可以通过调用bool isBadVersion(version)接口来判断版本号version是否存在单元测试中
	 *          出错，实现一个函数来查找第一个错误的版本，你应该尽量减少对调用API的次数。
	 *
	 *          给定 n = 5，并且 version = 4 是第一个错误的版本。
	 *          调用 isBadVersion(3) -> false
	 *          调用 isBadVersion(5) -> true
	 *          调用 isBadVersion(4) -> true
	 *          所以，4 是第一个错误的版本。
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * eg 1>:
	 * @输入Input:
	 * @输出Output:
	 * @说明:
	 *
	 * eg 2>:
	 * @输入Input:
	 * @输出Output:
	 * @说明:
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * @解题思路:
	 * @题目总结:
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 **/
}
