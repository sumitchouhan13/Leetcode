class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp , -1);
        return recursion(cost , n , dp);
    }
    public int recursion(int[] cost , int n , int[] dp){
        if(n == 0 || n == 1){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int firstStep = recursion(cost , n - 1 , dp) + cost[n - 1];
        int secondStep = recursion(cost , n - 2 , dp) + cost[n - 2];
        return dp[n] = Math.min(firstStep , secondStep);
    }
}