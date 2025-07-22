package com.Arise.DP;

import java.util.Arrays;

class Solution5{
    private int func(int i,int j,int[][] dp){
        if(i==0 || j==0) return 1;
        if(i<0 || j<0) return 0;
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int up = func(i,j-1,dp);
        int left = func(i-1,j,dp);
        return dp[i][j] = up+left;
    }

    public int gridUniquePath(int m,int n){
        int[][] dp = new int[m][n];
        for(int[] x: dp){
            Arrays.fill(x,-1);
        }
        return func(m-1,n-1,dp);
    }
}
public class program5 {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        int m = 3;
        int n = 2;
        int res = sol.gridUniquePath(m,n);
        System.out.println("Unique path "+res);
    }
}
