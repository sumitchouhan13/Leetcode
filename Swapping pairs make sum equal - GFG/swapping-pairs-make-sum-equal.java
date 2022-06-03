// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java


class Solution
{
    long findSwapValues(long A[], int n, long  B[], int m)
    {
        // Your code goes here
        long sum1=0;
        long sum2=0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(long i:A)
            sum1+=i; //storing the total sum of A[]
        for(long j:B)
            sum2+=j; //storing the total sum of B[]
        
        // long diff=Math.abs(sum1-sum2); //storing the absolute difference
        /** Cannot perform above operation for test case -- A{1,2,3,4} & B{1,2,3,4} **/
        int i=0,j=0;
        while(i<n && j<m)
        {
            /** So we should perform difference over here **/
            long p=sum1-A[i]+B[j];
            long q=sum2-B[j]+A[i];
            if(p==q)
            {
                return 1;
            }
            else if(p>q)
                i++;
            else
                j++;
        }
        return -1;
    }
}



// { Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int m =Integer.parseInt(q[1]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
            String line2 = br.readLine();
            String[] a2 = line2.trim().split("\\s+");
            long b[] = new long[m];
            for (int i = 0; i < m; i++) {
                b[i] = Long.parseLong(a2[i]);
            }
            Solution ob = new Solution();
            long ans = ob.findSwapValues(a,n,b,m);
            System.out.println(ans);
        }
    }
}




  // } Driver Code Ends