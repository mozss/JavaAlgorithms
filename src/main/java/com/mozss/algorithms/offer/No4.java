package com.mozss.algorithms.offer;
/*
* 给定一个二维数组，让每一行从左到右递增排序，从上到下也递增排序。
* 给定一个数，看这个数是否在这个二维数组中。
*
*   Consider the followign matrix:
*   [
*       [1,4,7,11,15]
*       [2,5,8,12,19]
*       [3,6,9,16,22]
*       [10,13,14,17,24]
*       [8,21,23,26,30]
*   ]
*   Given target = 5, return true;
*   Given target = 20,return false;
* */

public class No4 {
    public static void main(String[] args) {
        int target = 13;
        int matrix[][] = {{1,4,7,11,15}, {2,5,8,12,19},
                {3,6,9,16,22},{10,13,14,17,24}, {18,21,23,26,30}, };;
        Boolean res = new No4().find(target,matrix);
        if(res == false){
            System.out.println("没有该数字");
        }else{
            System.out.println("有该数字");
        }
    }

    private Boolean find(int target,int[][] matrix) {
         if(matrix == null || matrix.length ==0 || matrix[0].length ==0){
             return false;
         }
         int rows = matrix.length,cols = matrix[0].length;
         int r = 0, c= cols -1;
         while(r <= rows-1 && c >= 0){
             if (target == matrix[r][c]){
                 return true;
             }else if(target > matrix[r][c]){
                 r++;
             }else {
                 c--;
             }
         }
        return false;
    }
}
