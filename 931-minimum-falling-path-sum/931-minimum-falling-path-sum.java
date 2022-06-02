class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        int n = matrix.length , m = matrix[0].length;
        int[][] dp = new int[n][m];
        for(int[] ar : dp){
            Arrays.fill(ar , -1);
        }
        for(int j = 0 ; j < m ; j++){
            int recurredValue = recursion(0 , j , matrix , dp);
            min = Math.min(min , recurredValue);
        }
        return min;
    }
    public int recursion(int i , int j , int[][] matrix , int[][] dp){
        if(j < 0 || j >= matrix[0].length){
            return (int)Math.pow(10 , 9) + 7;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(i == matrix.length - 1){
            return matrix[i][j];
        }
        int down = matrix[i][j] + recursion(i + 1 , j , matrix , dp);
        int left = matrix[i][j] + recursion(i + 1 , j - 1 , matrix , dp);
        int right = matrix[i][j] + recursion(i + 1 , j + 1 , matrix , dp);
        return dp[i][j] = Math.min(down , Math.min(left , right));
    }
}