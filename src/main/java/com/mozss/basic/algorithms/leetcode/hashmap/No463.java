package com.mozss.basic.algorithms.leetcode.hashmap;

/**
 * @author mozss
 * @create 2019-09-06 11:12
 */
public class No463 {
    /**
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @题目名称:   岛屿的周长
     * @知识考察:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @题目描述:   给定一个包含0和1的二维网格地图,其中1表示陆地,0表示水域
     *             网格中的格子水平和垂直方向相连,(对角线不相连),整个网格被水完全包围,但其中恰好
     *             有一个岛屿(或者说,一个或多个表示陆地的格子相连组成的岛屿)
     *
     *             岛屿中没有湖的概念,格子是边长为1的正方形,网格是长方形,且宽度和高度均不是这个岛屿
     *             的长度.
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * eg 1>:
     * @输入Input:    [
     *                  [0,1,0,0]
     *                  [1,1,1,0]
     *                  [0,1,0,0]
     *                  [1,1,0,0]
     *                ]
     * @输出Output:   16
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
    public int islandPerimeter(int[][] grid) {
        int total = 0;
        int row = 0;
        int column = 0;
        for (int i = 0; i < grid.length; i++) {
            if (i < grid.length - 1) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 1 && grid[i + 1][j] == 1) {
                        column++;
                    }
                    total += grid[i][j];
                    if (j != 0 && grid[i][j - 1] == 1 && grid[i][j] == 1) {
                        row += grid[i][j];
                    }
                }
            }
            if (i == grid.length - 1) {
                for (int j = 0; j < grid[i].length; j++) {
                    total += grid[i][j];
                    if (j != 0 && grid[i][j - 1] == 1 && grid[i][j] == 1) {
                        row += grid[i][j];
                    }
                }
            }

        }
        return total * 4 - row * 2 - column * 2;
    }
    
    public static void main(String[] args) {
        No463 no463 = new No463();
        int[][] map = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(no463.islandPerimeter(map));
    }

}
