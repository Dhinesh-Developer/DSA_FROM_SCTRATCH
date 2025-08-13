package com.Arise.DP;

import javax.sound.midi.SysexMessage;
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

//    public static void numberInvalid(int number){
//        if(number instanceof String){
//
//            System.out.println(Integer.parseInt(number));
//        }else{
//            System.out.println("Inside else");
//            throw new NumberFormatException();
//        }
//    }

    public static void main(String[] args) {

        int number = 123;
        try{
//            numberInvalid(number);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
