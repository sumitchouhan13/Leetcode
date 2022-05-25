class Solution {
    public int uniquePaths(int m, int n) {
        // return recursion(m - 1 , n - 1);
        // int[][] dp = new int[m + 1][n + 1];
        // for(int[] ar : dp){
        //     Arrays.fill(ar , -1);
        // }
        // return memo(m - 1 , n - 1 , dp);
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = 1;
                }else{
                    int up = 0 , down = 0;
                    if(i > 0){
                      up = dp[i - 1][j];  
                    } 
                    if(j > 0){
                      down = dp[i][j - 1];  
                    } 
                    dp[i][j] = up + down;
                }
            }
        }
        return dp[m - 1][n - 1];
    }
    // public int recursion(int i  , int j){
    //     if(i == 0 && j == 0){
    //         return 1;
    //     }
    //     if(i < 0 || j < 0){
    //         return 0;
    //     }
    //     int up = recursion(i - 1 , j);
    //     int left = recursion(i , j - 1);
    //     return up + left;
    // }
    // public int memo(int i  , int j , int[][] dp){
    //     if(i == 0 && j == 0){
    //         return 1;
    //     }
    //     if(i < 0 || j < 0){
    //         return 0;
    //     }
    //     if(dp[i][j] != -1){
    //         return dp[i][j];
    //     }
    //     int up = memo(i - 1 , j , dp);
    //     int left = memo(i , j - 1 , dp);
    //     return dp[i][j] = up + left;
    // }
}