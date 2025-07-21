package com.Arise.DP;

import java.util.Arrays;

class Solution4{

    private int func(int day,int last,int[][] matrix,int[][] dp){
        if(dp[day][last] != -1){
            return dp[day][last];
        }
        if(day ==0){
            int maxi = 0;
            for(int i=0;i<3;i++){
                if(i!=last){
                    maxi = Math.max(maxi,matrix[0][i]);
                }
            }
            return maxi;
        }
        int maxi = 0;
        for(int i=0;i<3;i++){
            if(i!=last){
                int activity = matrix[day][i] + func(day-1,i,matrix,dp);
                maxi = Math.max(activity,maxi);
            }
        }
        dp[day][last] = maxi;
        return dp[day][last];
    }

    public int ninjaTraining(int[][] matrix){
        int n = matrix.length;
        int[][] dp = new int[n][4];
        for(int[] x : dp){
            Arrays.fill(x,-1);
        }
        return func(n-1,3,matrix,dp);
    }
}
public class program4 {
    public static void main(String[] args) {

        int[][] points = {
                {10, 40, 70},
                {20, 50, 80},
                {30, 60, 90}
        };
        Solution4 sol = new Solution4();
        int res = sol.ninjaTraining(points);
        System.out.println("Ninja training : "+res);

    }
}
