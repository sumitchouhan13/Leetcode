// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A[] = read.readLine().split(" ");
            
            String S = A[0];
            String T = A[1];

            Solution ob = new Solution();
            System.out.println(ob.shortestUnSub(S,T));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int shortestUnSub(String S, String T) {
        // code here
        int n = S.length() , m = T.length();
        int[][] dp = new int[n + 1][m + 1];
        int max = 600;
        for(int i = 0 ; i <= n ; i++){
            dp[i][0] = 1;
        }
        for(int i = 0 ; i <= m ; i++){
            dp[0][i] = max;
        }
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= m ; j++){
                int k;
                for(k = j - 1 ; k >= 0 ; --k){
                    if(T.charAt(k) == S.charAt(i - 1)){
                        break;
                    }
                }
                if(k == -1){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = Math.min(dp[i - 1][j] , 1 + dp[i - 1][k]);
                }
            }
        }
        return dp[n][m] >= max ? -1 : dp[n][m];
    }
};