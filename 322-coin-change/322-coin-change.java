class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        // for(int[] ar : dp){
        //     Arrays.fill(ar , -1);
        // }
        // // return recursion(n - 1 , amount , coins);
        // int val = memo(n - 1 , amount , coins , dp);
        // if(val == (int)Math.pow(10 , 9) + 7){
        //     return -1;
        // }
        // return val;
        for(int target = 0 ; target <= amount ; target++){
            if(target % coins[0] == 0){
                dp[0][target] = target / coins[0];
            }else{
                dp[0][target] = (int)Math.pow(10 , 9) + 7;
            }
        }
        int val = tabulation(amount , coins , dp);
        if(val == (int)Math.pow(10 , 9) + 7){
            return -1;
        }
        return val;
    }
    // public int recursion(int index , int target , int[] a){
    //     if(index == 0){
    //         if(target % a[index] == 0){
    //             return target / a[index];
    //         }
    //         return (int)Math.pow(10 , 9) + 7;
    //     }
    //     int notTake = recursion(index - 1 , target , a);
    //     int take = (int)Math.pow(10 , 9) + 7;
    //     if(a[index] <= target){
    //         take = 1 + recursion(index , target - a[index] , a);
    //     }
    //     return Math.min(take , notTake);
    // }
    // public int memo(int index , int target , int[] a , int[][] dp){
    //     if(index == 0){
    //         if(target % a[index] == 0){
    //             return target / a[index];
    //         }
    //         return (int)Math.pow(10 , 9) + 7;
    //     }
    //     if(dp[index][target] != -1){
    //         return dp[index][target];
    //     }
    //     int notTake = memo(index - 1 , target , a , dp);
    //     int take = (int)Math.pow(10 , 9) + 7;
    //     if(a[index] <= target){
    //         take = 1 + memo(index , target - a[index] , a , dp);
    //     }
    //     return dp[index][target] = Math.min(take , notTake);
    // }
    public int tabulation(int amount , int[] coins , int[][] dp){
        for(int i = 1 ; i < coins.length ; i++){
            for(int t = 0 ; t <= amount ; t++){
                int notTake = dp[i -1][t];
                int take = (int)Math.pow(10 , 9) + 7;
                if(coins[i] <= t){
                    take = 1 + dp[i][t - coins[i]];
                }
                dp[i][t] = Math.min(notTake , take);
            }
        }
        return dp[coins.length - 1][amount];
    }
}