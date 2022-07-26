class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] map = new int[m][n];
        for (int[] g: guards) {
            map[g[0]][g[1]] = 2; // means guard
        }
        
        for (int[] w: walls) {
            map[w[0]][w[1]] = 3; // means wall
        }      
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 2) { // search guard
                    dfs(map, i, j, m, n);
                }
            }
        }        
        
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 0) // count unprotected
                    cnt++;
            }
        }
        return cnt;
    }
    
    void dfs(int[][] map, int x, int y, int m, int n) {
        for (int i = x-1; i >= 0; i--) {  // search up
            if (map[i][y] == 2 || map[i][y] == 3) {
                break;
            }
            map[i][y] = 1; // change to protected
        }
        for (int i = x+1; i < m; i++) { // search down
            if (map[i][y] == 2 || map[i][y] == 3) {
                break;
            }
            map[i][y] = 1; // change to protected
        }
        for (int j = y-1; j >= 0; j--) { // search left
            if (map[x][j] == 2 || map[x][j] == 3) {
                break;
            }
            map[x][j] = 1; // change to protected
        }
        for (int j = y+1; j < n; j++) { // search right
            if (map[x][j] == 2 || map[x][j] == 3) {
                break;
            }
            map[x][j] = 1; // change to protected
        }       
        
    }
}