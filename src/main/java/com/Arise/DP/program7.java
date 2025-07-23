package com.Arise.DP;
// Best Time To Sell And Buy 1
class Solution7{
    public int bestTimeToSellAndBuy1(int[] ar){
        int maxProfit = 0;
        int mini =ar[0];
        for(int i=0;i<ar.length;i++){
            int cur = ar[i]-mini;
            maxProfit = Math.max(cur,maxProfit);
            mini = Math.min(ar[i],mini);
        }
        return maxProfit;
    }

}
public class program7 {
    public static void main(String[] args) {
        int[] ar = {7, 1, 5, 3, 6, 4};;
        Solution7 sol = new Solution7();
        int res = sol.bestTimeToSellAndBuy1(ar);
        System.out.println(res);
    }
}
