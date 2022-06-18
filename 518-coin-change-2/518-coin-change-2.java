class Solution {
    public int change(int amount, int[] coins) {
        int ind = coins.length;
        int[][] dp = new int[ind][amount + 1];
        // for(int[] ar : dp){
        //     Arrays.fill(ar , -1);
        // }
        // return recursion(ind - 1 , amount , coins);
        // return memo(ind - 1 , amount , coins , dp);
        for(int t = 0 ; t <= amount ; t++){
            dp[0][t] = (t % coins[0] == 0) ? 1 : 0;
        }
        for(int index = 1 ; index < ind ; index++){
            for(int t = 0 ; t <= amount ; t++){
                int notTake = dp[index - 1][t];
                int take = 0;
                if(coins[index] <= t){
                    take = dp[index][t - coins[index]];
                }
                dp[index][t] = take + notTake;
            }
        }
        return dp[ind - 1][amount];
    }
    // public int recursion(int index , int amount , int[] coins){
    //     if(index == 0){
    //         return (amount % coins[index] == 0 ? 1 : 0);
    //     }
    //     int notTake = recursion(index - 1 , amount , coins);
    //     int take = 0;
    //     if(coins[index] <= amount){
    //         take = recursion(index , amount - coins[index] , coins);
    //     }
    //     return take + notTake;
    // }
    // public int memo(int index , int amount , int[] coins , int[][] dp){
    //     if(index == 0){
    //         return (amount % coins[index] == 0 ? 1 : 0);
    //     }
    //     if(dp[index][amount] != -1){
    //         return dp[index][amount];
    //     }
    //     int notTake = memo(index - 1 , amount , coins , dp);
    //     int take = 0;
    //     if(coins[index] <= amount){
    //         take = memo(index , amount - coins[index] , coins , dp);
    //     }
    //     return dp[index][amount]= take + notTake;
    // }
}