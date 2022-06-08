class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int m = accounts[0].length;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            int total = 0;
            for(int j = 0 ; j < m ; j++){
                total += accounts[i][j];
            }
            max = Math.max(max , total);
        }
        return max;
    }
}