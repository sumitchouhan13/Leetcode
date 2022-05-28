class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length , m = matrix[0].length;
        int[][] dp = new int[n][m];
        for(int[] ar : dp){
            Arrays.fill(ar , -1);
        }
        int min = Integer.MAX_VALUE;
        for(int j = 0 ; j < m ; j++){
            int call = memo(n - 1 , j , matrix , dp);
            min = Math.min(min , call);
        }
        return min;
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
}