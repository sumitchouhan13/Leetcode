// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maximumPath(int n, int Matrix[][])
    {
        // code here
        int[][] dp = new int[n][n];
        return tabulation(n , Matrix , dp);
    }
    static int tabulation(int n , int[][] m , int[][] dp){
        for(int j = 0 ; j < n ; j++){
            dp[0][j] = m[0][j];
        }
        for(int i = 1 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                int left = -(int)Math.pow(10 , 9) + 7 , right = -(int)Math.pow(10 , 9) + 7;
                if(j >= 1){
                    left = m[i][j] + dp[i - 1][j - 1];
                }
                if(j < n - 1){
                    right = m[i][j] + dp[i - 1][j + 1];
                }
                int up = m[i][j] + dp[i - 1][j];
                dp[i][j] = Math.max(up , Math.max(left , right));
            }
        }
        int max = Integer.MIN_VALUE;
        for(int j = 0 ; j < n ; j++){
            max = Math.max(max , dp[n - 1][j]);
        }
        return max;
    }
}