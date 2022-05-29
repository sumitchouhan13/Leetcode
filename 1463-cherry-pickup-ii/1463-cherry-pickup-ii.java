class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length , m = grid[0].length;
        int[][][] dp = new int[n][m][m];
        // for(int[][] ar : dp){
        //     for(int[] a : ar){
        //         Arrays.fill(a , -1);
        //     }
        // }
        // // return recursion(0 , 0 , m - 1 , n , m , grid);
        // return memo(0 , 0 , m - 1 , n , m , grid , dp);
        return tabulation(grid , dp);
    }
    // public int recursion(int i , int j1 , int j2 , int n , int m , int[][] grid){
    //     if(j1 < 0 || j1 >= m || j2 < 0 || j2 >= m){
    //         return -(int)Math.pow(10 , 9) + 7;
    //     }
    //     if(i == n - 1){
    //         if(j1 == j2){
    //             return grid[i][j1];
    //         }else{
    //             return grid[i][j1] + grid[i][j2];
    //         }
    //     }
    //     int max = 0;
    //     for(int s1 = -1 ; s1 <= 1 ; s1++){
    //         for(int s2 = -1 ; s2 <= 1 ; s2++){
    //             if(j1 == j2){
    //                 max = Math.max(max , grid[i][j1] + recursion(i + 1 , j1 + s1 , j2 + s2 , n , m , grid));
    //             }else{
    //                 max = Math.max(max , grid[i][j1] + grid[i][j2] + recursion(i + 1 , j1 + s1 , j2 + s2 , n , m , grid));
    //             }
    //         }
    //     }
    //     return max;
    // }
    // public int memo(int i , int j1 , int j2 , int n , int m , int[][] grid , int[][][] dp){
    //     if(j1 < 0 || j1 >= m || j2 < 0 || j2 >= m){
    //         return -(int)Math.pow(10 , 9) + 7;
    //     }
    //     if(dp[i][j1][j2] != -1){
    //         return dp[i][j1][j2];
    //     }
    //     if(i == n - 1){
    //         if(j1 == j2){
    //             return grid[i][j1];
    //         }else{
    //             return grid[i][j1] + grid[i][j2];
    //         }
    //     }
    //     int max = 0;
    //     for(int s1 = -1 ; s1 <= 1 ; s1++){
    //         for(int s2 = -1 ; s2 <= 1 ; s2++){
    //             if(j1 == j2){
    //                 max = Math.max(max , grid[i][j1] + memo(i + 1 , j1 + s1 , j2 + s2 , n , m , grid ,dp));
    //             }else{
    //                 max = Math.max(max , grid[i][j1] + grid[i][j2] + memo(i + 1 , j1 + s1 , j2 + s2 , n , m , grid , dp));
    //             }
    //         }
    //     }
    //     return dp[i][j1][j2] = max;
    // }
    public int tabulation(int[][] grid , int[][][] dp){
        int m = grid[0].length , n = grid.length;
        for(int j1 = 0 ; j1 < m ; j1++){
            for(int j2 = 0 ; j2 < m ; j2++){
                if(j1 == j2){
                    dp[n - 1][j1][j2] = grid[n - 1][j1];
                }else{
                    dp[n - 1][j1][j2] = grid[n - 1][j1] + grid[n - 1][j2];
                }
            }
        }
        for(int i = n - 2 ; i >= 0 ; i--){
            for(int j1 = 0 ; j1 < m ; j1++){
                for(int j2 = 0 ; j2 < m ; j2++){
                    int max = -(int)Math.pow(10 , 9) + 7;
                        for(int s1 = -1 ; s1 <= 1 ; s1++){
                            for(int s2 = -1 ; s2 <= 1 ; s2++){
                                int value = 0;
                                if(j1 == j2){
                                    value = grid[i][j1];
                                }else{
                                    value = grid[i][j1] + grid[i][j2];
                                }
                                if(j1 + s1 >= 0 && j1 + s1 < m && j2 + s2 >= 0 && j2 + s2 < m){
                                    value += dp[i + 1][j1 + s1][j2 + s2];
                                }else{
                                    value += -(int)Math.pow(10 , 9) + 7;
                                }
                                max = Math.max(max , value);
                            }
                        }
                    dp[i][j1][j2] = max;
                }
            }
        }
        return dp[0][0][m - 1];
    }
}