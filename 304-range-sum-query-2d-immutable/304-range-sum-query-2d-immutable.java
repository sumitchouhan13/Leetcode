class NumMatrix {
    private int[][] mat;
    public NumMatrix(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return;
        }
        mat = new int[matrix.length][matrix[0].length + 1];
        for(int r = 0 ; r < matrix.length ; r++){
            for(int c = 0 ; c < matrix[0].length ; c++){
                mat[r][c + 1] = mat[r][c] + matrix[r][c];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for(int i = row1 ; i <= row2 ; i++){
            sum += mat[i][col2 + 1] - mat[i][col1];
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */