class Solution {
    public int diagonalSum(int[][] mat) {
        if(mat == null || mat.length == 0)
            return 0;
        int r = mat.length;
        int c = mat[0].length;
        int sum = 0;
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                if(i == j || (i + j) == c - 1)
                    sum+=mat[i][j];
            }
        }
        return sum;
    }
}