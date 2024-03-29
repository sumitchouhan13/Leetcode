class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size() , m = triangle.get(n - 1).size();
        int[][] dp = new int[n][m];
        // for(int[] ar : dp){
        //     Arrays.fill(ar , -1);
        // }
        // // return recursion(0 , 0 , triangle);
        // return memo(0 , 0 , triangle , dp);
        for(int j = 0 ; j < n ; j++){
            dp[n - 1][j] = triangle.get(n - 1).get(j);
        }
        for(int i = n - 2 ; i >= 0 ; i--){
            for(int j = i ; j >= 0 ; j--){
                int down = triangle.get(i).get(j) + dp[i + 1][j];
                int diag = triangle.get(i).get(j) + dp[i + 1][j + 1];
                dp[i][j] = Math.min(down , diag);
            }
        }
        return dp[0][0];
    }
    // public int recursion(int i , int j , List<List<Integer>> triangle){
    //     if(i == triangle.size() - 1){
    //         return triangle.get(i).get(j);
    //     }
    //     int down = triangle.get(i).get(j) + recursion(i + 1 , j , triangle);
    //     int diag = triangle.get(i).get(j) + recursion(i + 1 , j + 1 , triangle);
    //     return Math.min(down , diag);
    // }
    public int memo(int i , int j , List<List<Integer>> triangle , int[][] dp){
        if(i == triangle.size() - 1){
            return triangle.get(i).get(j);
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int down = triangle.get(i).get(j) + memo(i + 1 , j , triangle , dp);
        int diag = triangle.get(i).get(j) + memo(i + 1 , j + 1 , triangle , dp);
        return dp[i][j] = Math.min(down , diag);
    }
}