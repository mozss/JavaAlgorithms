package com.mozss.basic.algorithms.leetcode.hashmap;

/**
 * @author mozss
 * @create 2019-09-06 11:12
 */
/*
 * 463.岛屿的周长
 *
 * 给定一个包含0和1的二维网格地图，其中1表示陆地，0表示水域。
 * 网格中的格子水平和垂直方向相连，（对角线方向不相连），整个网格被水完全包围，但其中恰好有一个岛屿（或者说，
 * 一个或者多个表示陆地的格子相连组成的岛屿）。
 *
 * 岛屿中没有“湖”（湖指的是水域在岛屿内且不和岛屿周围的水相连），格子是边长为1的正方形，网格为长方形，且宽度和高度均不超过100。计算
 * 这个岛屿的周长。
 *
 * 示例：
 * 输入：
 * [
 * [0,1,0,0]
 * [1,1,1,0]
 * [0,1,0,0]
 * [1,1,0,0]
 * ]
 * 输出：16
 *
 *
 *
 *
 * */
public class No_463 {
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

}
