class Solution {
    int mod = 1000000007;
    public int countVowelPermutation(int n) {
        int[][] dp = new int[5][n];
        for(int i = 0 ; i < 5 ; i++){
            dp[i][0] = 1; 
        }
        for(int i = 1 ; i < n ; i++){
            dp[0][i] = (dp[1][i - 1] + dp[2][i - 1]) % mod + dp[4][i - 1];
            dp[1][i] = dp[0][i - 1] + dp[2][i - 1];
            dp[2][i] = dp[1][i - 1] + dp[3][i - 1];
            dp[3][i] = dp[2][i - 1];
            dp[4][i] = dp[2][i - 1] + dp[3][i - 1];
            for(int j = 0 ; j < 5 ; j++){
                dp[j][i] %= mod;
            }
        }
        int sum = 0;
        for(int i = 0 ; i < 5 ; i++){
            sum = (sum + dp[i][n - 1]) % mod;
        }
        return sum;
    }
}