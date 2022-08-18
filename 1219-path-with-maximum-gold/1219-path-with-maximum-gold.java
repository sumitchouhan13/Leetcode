class Solution {
    int max = 0;
    public int getMaximumGold(int[][] grid) {
        int n = grid.length , m = grid[0].length;
        int[][] vis = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] != 0){
                    dfs(grid , i , j , 0 , vis);
                }
            }
        }
        return max;
    }
    public void dfs(int[][] grid , int i , int j , int sum , int[][] vis){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || vis[i][j] == 1){
            max = Math.max(max , sum);
            return;
        }
        vis[i][j] = 1;
        dfs(grid , i + 1 , j , sum + grid[i][j] , vis);
        dfs(grid , i - 1 , j , sum + grid[i][j] , vis);
        dfs(grid , i , j + 1 , sum + grid[i][j] , vis);
        dfs(grid , i , j - 1 , sum + grid[i][j] , vis);
        vis[i][j] = 0;
    }
}