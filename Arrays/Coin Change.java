/*
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.

 

Example 1:

Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1
Example 2:

Input: coins = [2], amount = 3
Output: -1
Example 3:

Input: coins = [1], amount = 0
Output: 0
 

Constraints:

1 <= coins.length <= 12
1 <= coins[i] <= 231 - 1
0 <= amount <= 104
*/

class Solution {
    public int coinChange(int[] coins, int amt) {
        int m = coins.length;
        int[] dp = new int[amt+1];
        dp[0] = 0;
        for(int i=1;i<=amt;i++)
            dp[i] = Integer.MAX_VALUE;
        for(int i=1;i<=amt;i++){
            for(int j=0;j<m;j++){
                if(coins[j] <= i){
                    int sub = dp[i-coins[j]];
                    if(sub != Integer.MAX_VALUE && sub+1 < dp[i]){
                        dp[i] = sub+1;
                    }
                }
            }
        }
        if(dp[amt] == Integer.MAX_VALUE)
            return -1;
        return dp[amt];
    }
}
