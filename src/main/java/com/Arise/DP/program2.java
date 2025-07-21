package com.Arise.DP;
// Frog Jump

import java.util.Arrays;

class Solution1{

    private int func(int[] heights,int ind,int[] dp){
        if(ind==0) return 0;
        if(dp[ind] != -1){
            return dp[ind];
        }
        int one = func(heights,ind-1,dp) + Math.abs(heights[ind] - heights[ind-1]);
        int two = Integer.MAX_VALUE;
        if(ind > 1){
            two = func(heights,ind-2,dp) + Math.abs(heights[ind] - heights[ind-2]);
        }
        dp[ind] = Math.min(one,two);
        return dp[ind];
    }

    public int frogJump(int[] heights){
        int n = heights.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return func(heights,n-1,dp);
    }

}
public class program2 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int[] heights = {2, 1, 3, 5, 4};
        int res = sol.frogJump(heights);
        System.out.println("Min path for frog to jumps to reach (n-1) "+res);

    }
}
