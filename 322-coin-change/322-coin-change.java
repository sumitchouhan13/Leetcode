class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for(int[] ar : dp){
            Arrays.fill(ar , -1);
        }
        // return recursion(n - 1 , amount , coins);
        int val = memo(n - 1 , amount , coins , dp);
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
    public int memo(int index , int target , int[] a , int[][] dp){
        if(index == 0){
            if(target % a[index] == 0){
                return target / a[index];
            }
            return (int)Math.pow(10 , 9) + 7;
        }
        if(dp[index][target] != -1){
            return dp[index][target];
        }
        int notTake = memo(index - 1 , target , a , dp);
        int take = (int)Math.pow(10 , 9) + 7;
        if(a[index] <= target){
            take = 1 + memo(index , target - a[index] , a , dp);
        }
        return dp[index][target] = Math.min(take , notTake);
    }
}