class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean flag = false;
        //search in all valid rows
        for(int row=0;row<matrix.length;row++){
            if(matrix[row][0] <= target && target <= matrix[row][matrix[0].length-1]){           
                flag = flag || find(matrix,target,row);
            } 
        }

        return flag;
    }
    
    //binary search
    public boolean find(int[][] matrix, int target,int row){
        int left = 0;
        int right = matrix[0].length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(matrix[row][mid] == target){
                return true;
            }
            else if(matrix[row][mid] > target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return false;
    }
}