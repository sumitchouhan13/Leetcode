class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.get(triangle.size() - 1).size()];
        for(int[] ar : dp){
            Arrays.fill(ar , -1);
        }
        return recursion(0 , 0 , triangle , dp);
    }
    public int recursion(int i , int j , List<List<Integer>> triangle , int[][] dp){
        if(i == triangle.size() - 1){
            return triangle.get(i).get(j);
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int down = triangle.get(i).get(j) + recursion(i + 1 , j , triangle , dp);
        int right = triangle.get(i).get(j) +  recursion(i + 1 , j + 1 , triangle , dp);
        return dp[i][j] = Math.min(down , right);
    }
}