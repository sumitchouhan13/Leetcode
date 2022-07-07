// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG
{
    public static void main (String[] args)
	{
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            
            int tree[]= new int[n];
            for(int i=0; i<n; i++)
                tree[i] = in.nextInt();
            int k = in.nextInt();
            
            Solution x = new Solution();
            System.out.println( x.find_height(tree,n,k) );
        }
	}
}// } Driver Code Ends


class Solution
{
    static int find_height(int tree[], int n, int k)
    {
        int low = 0 , high = tree[0];
        for(int i = 0 ; i < n ; i++){
            high = Math.max(high , tree[i]);
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            int val = 0;
            for(int e : tree){
                if(e > mid){
                    val += (e - mid);
                }
            }
            if(val == k){
                return mid;
            }else if(val > k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}