class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length , m = grid[0].length;
        int[][] dp = new int[n + 1][m + 1];
        for(int[] ar : dp){
            Arrays.fill(ar , -1);
        }
        return recursion(n - 1 , m - 1 , grid , dp);
    }
    public int recursion(int i , int j , int[][] grid , int[][] dp){
        if(i == 0 && j == 0){
            return grid[0][0];
        }
        if(i < 0 || j < 0){
            return (int)Math.pow(10 , 9);
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int up = grid[i][j] + recursion(i - 1 , j , grid , dp);
        int left = grid[i][j] + recursion(i , j - 1 , grid , dp);
        return dp[i][j] = Math.min(up , left);
    }
}