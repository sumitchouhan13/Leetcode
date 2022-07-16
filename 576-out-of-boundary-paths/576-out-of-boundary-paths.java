// class Solution {
//     int mod = 1000000007;
//     public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
//         int[][][] dp = new int[m][n][maxMove + 1];
//         for(int[][] ar1 : dp){
//             for(int[] ar2 : ar1){
//                 Arrays.fill(ar2 , -1);
//             }
//         }
//         return memoization(m , n , maxMove , startRow , startColumn , dp);
//     }
//     public int memoization(int m , int n , int maxMove , int startRow , int startColumn , int[][][] dp){
//         if(startRow == m || startColumn == n || startRow < 0 || startColumn < 0){
//             return 1;
//         }
//         if(maxMove == 0){
//             return 0;
//         }
//         if(dp[startRow][startColumn][maxMove] != -1){
//             return dp[startRow][startColumn][maxMove];
//         }
//         dp[startRow][startColumn][maxMove] = (findPaths(m , n , maxMove - 1 , startRow + 1 , startColumn) + 
//         findPaths(m , n , maxMove - 1 , startRow - 1 , startColumn)) % mod + 
//         (findPaths(m , n , maxMove - 1 , startRow , startColumn + 1) + 
//         findPaths(m , n , maxMove - 1 , startRow , startColumn - 1)) % mod;
//         return dp[startRow][startColumn][maxMove];
//     }
// }
class Solution {
  public int findPaths(int m, int n, int N, int x, int y) {
    int M = 1000000000 + 7;
    int dp[][] = new int[m][n];
    dp[x][y] = 1;
    int count = 0;
    for (int moves = 1; moves <= N; moves++) {
      int[][] temp = new int[m][n];
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          if (i == m - 1) count = (count + dp[i][j]) % M;
          if (j == n - 1) count = (count + dp[i][j]) % M;
          if (i == 0) count = (count + dp[i][j]) % M;
          if (j == 0) count = (count + dp[i][j]) % M;
          temp[i][j] = (
              ((i > 0 ? dp[i - 1][j] : 0) + (i < m - 1 ? dp[i + 1][j] : 0)) % M +
              ((j > 0 ? dp[i][j - 1] : 0) + (j < n - 1 ? dp[i][j + 1] : 0)) % M
          ) % M;
        }
      }
      dp = temp;
    }
    return count;
  }
}