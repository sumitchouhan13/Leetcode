// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int m = Integer.parseInt(input[0]); 
            int n = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.numberOfPaths(m,n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    long numberOfPaths(int m, int n)
    {
        // code here
        // long[][] dp = new long[m + 1][n + 1];
        // for(long[] ar : dp){
        //     Arrays.fill(ar , -1);
        // }
        // return memo(m - 1 , n - 1 , dp);
        long mod = (int)Math.pow(10 , 9) + 7;
        long[][] dp = new long[m][n];
        dp[0][0] = 1;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = 1;
                }else{
                    long up = 0 , down = 0;
                    if(i > 0){
                      up = dp[i - 1][j];  
                    } 
                    if(j > 0){
                      down = dp[i][j - 1];  
                    } 
                    dp[i][j] = (up % mod + down % mod) % mod;
                }
            }
        }
        return dp[m - 1][n - 1];
    }
    
    long memo(int i , int j , long[][] dp){
        if(i == 0 && j == 0){
            return 1;
        }
        if(i < 0 || j < 0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        long up = memo(i - 1 , j , dp);
        long left = memo(i , j - 1 , dp);
        return up + left;
    }
    
}