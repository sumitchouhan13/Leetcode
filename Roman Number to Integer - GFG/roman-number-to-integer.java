// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        HashMap<Character, Integer> roman = new HashMap<>();
       
       roman.put('I',1);
       roman.put('V', 5);
       roman.put('X', 10);
       roman.put('L', 50);
       roman.put('C', 100);
       roman.put('D', 500);
       roman.put('M', 1000);
       
       int integer = 0;
       int n = str.length();
       
       if(n == 1)
           return roman.get(str.charAt(0));
       
       for(int i=0; i<n; i++)
       {
           if(i<n-1 && roman.get(str.charAt(i))<roman.get(str.charAt(i+1)))
           {
               integer += roman.get(str.charAt(i+1)) - roman.get(str.charAt(i));
               i++;
           }
           else
               integer += roman.get(str.charAt(i));
       }
       return integer;
    }
}