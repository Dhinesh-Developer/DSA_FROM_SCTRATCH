package com.Arise.DP;

import java.util.Arrays;

class Solution8{

    private int func(int ind,int buy,int[] ar,int n,int[][] dp){
        if(ind==n) return 0;
        if(dp[ind][buy] != 0){
            return dp[ind][buy];
        }
        int profit = 0;
        if(buy == 0) {
            profit = Math.max(0+func(ind+1,0,ar,n,dp), (-1)*ar[ind]+func(ind+1,1,ar,n,dp));
        }
        if(buy==1){
            profit = Math.max(0+func(ind+1,1,ar,n,dp), ar[ind]+func(ind+1,0,ar,n,dp));
        }
        return dp[ind][buy] = profit;

    }
    public int bestTimeToSellAndBuy2(int[] ar){
        int n = ar.length;
        if(n==0) return 0;
        int[][] dp = new int[n][n];
        for(int[] x : dp){
            Arrays.fill(x,-1);
        }
        int res = func(0,0,ar,n,dp);
        return res;
    }

}
public class program8 {
    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};
        Solution8 sol = new Solution8();
        int res = sol.bestTimeToSellAndBuy2(arr);
        System.out.println(res);
    }
}
