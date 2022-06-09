class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for(int[] ar : dp){
            Arrays.fill(ar , -1);
        }
        int val = recursion(n - 1 , amount , coins , dp);
        if(val == (int)Math.pow(10 , 9) + 7){
            return -1;
        }
        return val;
    }
    public int recursion(int index , int amount , int[] coins ,int[][] dp){
        if(index == 0){
            if(amount % coins[0] == 0){
                return amount / coins[0];
            }
            return (int)Math.pow(10 , 9) + 7;
        }
        if(dp[index][amount] != -1){
            return dp[index][amount];
        }
        int notTake = recursion(index - 1 , amount , coins ,dp);
        int take = (int)Math.pow(10 , 9) + 7;
        if(coins[index] <= amount){
            take = 1 + recursion(index , amount - coins[index] , coins , dp);
        }
        return dp[index][amount] = Math.min(notTake , take);
    }
}