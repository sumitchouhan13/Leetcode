// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.minSum(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public static long minSum(int arr[], int n)
    {
        // Your code goes here
        Arrays.sort(arr);
        if(n == 1){
            return arr[0];
        }
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            if(i % 2 == 0){
                even.append(arr[i]);
            }else{
                odd.append(arr[i]);
            }
        }
        long even1 = Long.parseLong(even.toString());
        long odd1 = Long.parseLong(odd.toString());
        return even1 + odd1;
    }
}