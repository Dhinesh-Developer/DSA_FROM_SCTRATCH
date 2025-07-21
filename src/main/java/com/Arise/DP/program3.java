package com.Arise.DP;

import java.util.Arrays;

// House Robber
class Solution2{

    private int func(int ind,int[] money,int[] dp){
        if(ind==0) return money[0];
        if(ind<0) return 0;
        if(dp[ind] != -1){
            return dp[ind];
        }

        int pick = money[ind] + func(ind-2,money,dp);
        int notPick = 0+ func(ind-1,money,dp);

        dp[ind] = Math.max(pick,notPick);
        return dp[ind];
    }

    public int houseRobber(int[] money){
        int n = money.length;
        if(n==0) return 0;
        if(n==1) return money[0];
        int[] ar1 = new int[n];
        int[] ar2 = new int[n];
        for(int i=0;i<n;i++){
            if(i!=n-1){
                ar1[i] = money[i];
            }
            if(i!=0){
                ar2[i] = money[i];
            }
        }

        int[] dp1 = new int[n];
        Arrays.fill(dp1,-1);
        int ans1 = func(ar1.length-1,money,dp1);

        int[] dp2 = new int[n];
        Arrays.fill(dp2,-1);
        int ans2 = func(ar2.length-2,money,dp2);

        return Math.max(ans1,ans2);
    }

}

public class program3 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] ar = {1, 5, 1, 2, 6};
        int res = sol.houseRobber(ar);
        System.out.println("Maximum robbed value "+res);

    }
}
