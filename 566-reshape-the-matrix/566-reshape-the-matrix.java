class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if(m * n  !=  r * c){
            return mat;
        }
        int[][] res = new int[r][c];
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                al.add(mat[i][j]);
            }
        }
        int k = 0;
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                res[i][j] = al.get(k);
                k++;
            }
        }
        return res;
    }
}