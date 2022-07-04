// { Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int a = Integer.parseInt(br.readLine().trim());
            int b = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            System.out.println(ob.minVal(a, b));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int minVal(int a, int b) {
        // code here
        int noOfBitsInB = 0;
        for(int i=30; i>=0; i--){
            if(((b>>i)&1) != 0){
                noOfBitsInB += 1;
            }
        }
        int cnt = noOfBitsInB;
        // System.out.println(noOfBitsInB);
        int x = 0;
        for(int i=30; i>=0 && cnt>0; i--){
            if(((a>>i)&1) != 0){
                x = (x^(1<<i));
                cnt -= 1;
            }
        }
        // System.out.println(x);
        for(int i=0; i<31 && cnt>0; i++){
            if(((x>>i)&1) == 0){
                x = (x^(1<<i));
                cnt -= 1;
            }
        }
        return x;
    }
}