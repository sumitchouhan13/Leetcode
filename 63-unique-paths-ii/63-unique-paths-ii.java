class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length , m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        return recursion(n - 1 , m - 1 , obstacleGrid , dp);
    }
    public int recursion(int i , int j , int[][] grid , int[][] dp){
        if(i == 0 && j == 0){
            if(grid[0][0] == 0) return 1;
            return 0;
        }
        if(i < 0 || j < 0 || grid[i][j] == 1){
            return 0;
        }
        if(dp[i][j] > 0){
            return dp[i][j];
        }
        int up = recursion(i - 1 , j , grid , dp);
        int left = recursion(i , j - 1 , grid , dp);
        return dp[i][j] = up + left;
    }
}