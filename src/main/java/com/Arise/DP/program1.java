package com.Arise.DP;
// Climb Stairs

import java.util.Arrays;

class Solution{

    private int func(int n,int[] dp){
        if(n<=2) return n;
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = func(n-1,dp) + func(n-2,dp);
    }

    public int climbStairs(int n){
        if(n<=2){
            return n;
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return func(n,dp);
    }

}

public class program1 {
    public static void main(String[] args) {

        int n = 3;

        //Create an instance of Solution class
        Solution sol = new Solution();

        //Print the answer
        System.out.println("The total number of ways: "+sol.climbStairs(n));
    }
}
