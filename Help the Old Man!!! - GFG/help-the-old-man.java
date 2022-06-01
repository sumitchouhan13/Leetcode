// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            int n = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.shiftPile(N, n);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static void toh(ArrayList<Integer> lst,int n, int a, int b, int c) {
		
		if (n==1) {
//			System.out.println(" move disc 1 from " + a + " to " + c);
			lst.add(a);
			lst.add(c);
			return;
	}
		toh(lst,n-1,a,c,b); 
//		System.out.println(" move disc "+n+" from "+a+" to "+c);
		lst.add(a);
		lst.add(c);
		toh(lst,n-1,b,a,c); 
	}
    static List<Integer> shiftPile(int N, int n){
        ArrayList<Integer> l = new ArrayList<Integer>();
		toh(l,N,1,2,3);
		ArrayList<Integer> ls = new ArrayList<Integer>();
		ls.add(l.get((2*n)-2));
		ls.add(l.get((2*n)-1));
		return ls;
    }
}