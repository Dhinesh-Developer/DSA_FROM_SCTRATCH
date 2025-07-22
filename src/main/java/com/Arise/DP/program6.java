package com.Arise.DP;

import java.util.Arrays;
// Grid unique path 2
class Solution6{

    private int func(int i,int j,int[][] matrix,int[][] dp){
        if(i>=0 && j>=0 && matrix[i][j] == 1) return 0;
        if(i==0 || j==0) return 1;
        if(i<0 || j<0) return 0;
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int up = func(i,j-1,matrix,dp);
        int left = func(i-1,j,matrix,dp);
        return dp[i][j] = up+left;
    }
    public int uniquePath2(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for(int[] x : dp){
            Arrays.fill(x,-1);
        }
        return func(m-1,n-1,matrix,dp);
    }

}

public class program6 {
    public static void main(String[] args) {

        int[][] maze = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        Solution6 sol = new Solution6();
        int res = sol.uniquePath2(maze);
        System.out.println("unique path 2 : "+res);

    }
}
