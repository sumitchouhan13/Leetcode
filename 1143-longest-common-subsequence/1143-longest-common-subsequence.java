class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length() , len2 = text2.length();
        int[][] dp = new int[len1][len2];
        for(int[] ar : dp){
            Arrays.fill(ar , -1);
        }
        return recursion(len1 - 1 , len2 - 1 , text1 , text2 , dp);
    }
    public int recursion(int ind1 , int ind2 , String t1 , String t2 , int[][] dp){
        if(ind1 < 0 || ind2 < 0){
            return 0;
        }
        if(dp[ind1][ind2] != -1){
            return dp[ind1][ind2];
        }
        if(t1.charAt(ind1) == t2.charAt(ind2)){
            return dp[ind1][ind2] = 1 + recursion(ind1 - 1 , ind2 - 1 , t1 , t2 , dp);
        }
        return dp[ind1][ind2] = 0 + Math.max(recursion(ind1 - 1 , ind2 , t1 , t2 , dp) , recursion(ind1 , ind2 - 1 , t1 , t2 , dp));
    }
}