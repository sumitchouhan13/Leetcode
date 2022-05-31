// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        int[][] dp = new int[N + 1][(int)Math.pow(10 , 5) + 1];
        for(int[] ar : dp){
            Arrays.fill(ar , -1);
        }
        return recursion(N - 1 , arr , sum , dp);
    }
    static Boolean recursion(int index , int[] ar , int target , int[][] dp){
        if(target == 0){
            return true;
        }
        if(dp[index][target] != -1){
            return dp[index][target]==0?false:true;
        }
        if(index == 0){
            return ar[index] == target;
        }
        Boolean notTake = recursion(index - 1 , ar , target , dp);
        Boolean take = false;
        if(target >= ar[index]){
            take = recursion(index - 1 , ar , target - ar[index] , dp);
        }
        dp[index][target] = (take || notTake ? 1 : 0);
        return take || notTake;
    }
}