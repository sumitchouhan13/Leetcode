class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length , m = matrix[0].length;
        int[][] dp = new int[n][m];
        // for(int[] ar : dp){
        //     Arrays.fill(ar , -1);
        // }
        // int min = Integer.MAX_VALUE;
        // for(int j = 0 ; j < m ; j++){
        //     int call = memo(n - 1 , j , matrix , dp);
        //     min = Math.min(min , call);
        // }
        // return min;
        return tabulation(n , m , matrix , dp);
    }
    public int memo(int i , int j , int[][] m , int[][] dp){
        if(j < 0 || j >= m[0].length){
            return (int)Math.pow(10 , 9) + 7;
        }
        if(i == 0){
            return m[i][j];
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int up = m[i][j] + memo(i - 1 , j , m , dp);
        int leftDiag = m[i][j] + memo(i - 1 , j - 1 , m , dp);
        int rightDiag = m[i][j] + memo(i - 1 , j + 1 , m , dp);
        return dp[i][j] = Math.min(up , Math.min(leftDiag , rightDiag));
    }
    public int tabulation(int n , int m , int[][] matrix , int[][] dp){
        for(int j = 0 ; j < m ; j++){
            dp[0][j] = matrix[0][j];
        }
        for(int i = 1 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                int left = (int)Math.pow(10 , 9) + 7 , right = (int)Math.pow(10 , 9) + 7;
                if(j >= 1){
                    left = matrix[i][j] + dp[i - 1][j - 1];
                }
                if(j + 1 < m){
                    right = matrix[i][j] + dp[i - 1][j + 1];
                }
                int up = matrix[i][j] + dp[i - 1][j];
                dp[i][j] = Math.min(up , Math.min(left , right));
            }
        }
        int min = Integer.MAX_VALUE;
        for(int j = 0 ; j < m ; j++){
            min = Math.min(min , dp[n - 1][j]);
        }
        return min;
    }
}