package com.example.medium;

import java.util.Arrays;

public class Solution_322 {
    int[] dp;
    public int coinChange(int[] coins, int amount) {
        dp = new int[amount+1];
        Arrays.fill(dp,-6);
        return dd(coins,amount);

    }
    public int dd(int[] coins,int amount){
        if(amount<0) return -1;
        if(amount==0) return 0;
        if(dp[amount]!=-6) return dp[amount];
        int res=Integer.MAX_VALUE,g=0;
        for(int f:coins){
            g=dd(coins,amount-f);
            if(g==-1) continue;
            res=Math.min(res,g+1);
        }
        dp[amount]=res==Integer.MAX_VALUE?-1:res;
        return dp[amount];
    }
}
