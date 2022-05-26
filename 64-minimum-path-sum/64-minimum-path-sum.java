class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length , m = grid[0].length;
        // int[][] dp = new int[n + 1][m + 1];
        // for(int[] ar : dp){
        //     Arrays.fill(ar , -1);
        // }
        // // return recursion1(n - 1 , m - 1 , grid);
        // // return recursion2(0 , 0 , grid);
        // return memo(n - 1 , m - 1 , grid , dp);
        int[][] dp = new int[n][m];
        dp[0][0] = grid[0][0];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = grid[0][0];
                }else{
                    
                int up = grid[i][j] , left = grid[i][j];
                if(i > 0){
                    up += dp[i - 1][j];
                }else{
                    up += (int)Math.pow(10,9);
                }
                if(j > 0){
                    left += dp[i][j - 1];
                }else{
                    left += (int)Math.pow(10,9);
                }
                dp[i][j] = Math.min(up , left);
            
                    
                }
            }
        }
        return dp[n - 1][m - 1];
    }
    // public int recursion1(int i , int j , int[][] grid){
    //     if(i == 0 && j == 0){
    //         return grid[0][0];
    //     }
    //     if(i < 0 || j < 0){
    //         return (int)Math.pow(10,9);
    //     }
    //     int up = grid[i][j] + recursion(i - 1 , j , grid);
    //     int left = grid[i][j] + recursion(i , j - 1 , grid);
    //     return Math.min(up , left);
    // }
    // public int recursion2(int i , int j , int[][] grid){
    //     if(i == grid.length - 1 && j == grid[0].length - 1){
    //         return grid[grid.length - 1][grid[0].length - 1];
    //     }
    //     if(i >= grid.length || j >= grid[0].length){
    //         return (int)Math.pow(10,9);
    //     }
    //     int up = grid[i][j] + recursion2(i + 1 , j , grid);
    //     int left = grid[i][j] + recursion2(i , j + 1 , grid);
    //     return Math.min(up , left);
    // }
    // public int memo(int i , int j , int[][] grid , int[][] dp){
    //     if(i == 0 && j == 0){
    //         return grid[0][0];
    //     }
    //     if(i < 0 || j < 0){
    //         return (int)Math.pow(10,9);
    //     }
    //     if(dp[i][j] != -1){
    //         return dp[i][j];
    //     }
    //     int up = grid[i][j] + memo(i - 1 , j , grid , dp);
    //     int left = grid[i][j] + memo(i , j - 1 , grid , dp);
    //     return dp[i][j] = Math.min(up , left);
    // }
}