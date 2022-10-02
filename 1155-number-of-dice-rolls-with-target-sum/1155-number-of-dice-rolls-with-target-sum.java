class Solution {
    public int memo(int n , int target , int k , int[][] dp){
        if(n == 0 && target == 0){
            return 1;
        }
        if(target < 0 || n < 0){
            return 0;
        }
        if(dp[n][target] != -1){
            return dp[n][target];
        }
        int count = 0;
        for(int i = 1 ; i <= k ; i++){
            count = (count + memo(n - 1 , target - i , k , dp)) % 1000000007;
        }
        dp[n][target] = count;
        return count;
    }
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n + 1][target + 1];
        for(int[] ar : dp){
            Arrays.fill(ar , -1);
        }
        return memo(n , target , k , dp);
    }
}