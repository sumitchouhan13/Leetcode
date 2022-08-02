class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for(int[] ar : matrix){
        //     for(int e : ar){
        //         pq.add(e);
        //     }
        // }
        // while(k-- > 1){
        //     pq.poll();
        // }
        // return pq.poll();
        int n = matrix.length;
        int low = matrix[0][0] , high = matrix[n - 1][n - 1];
        while(low < high){
            int mid = low + (high - low) / 2;
            int count = lessEqualFunction(matrix , mid);
            if(count < k){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return low;
    }
    public int lessEqualFunction(int[][] matrix , int target){
        int count = 0 , len = matrix.length;
        int i = len - 1 , j = 0;
        while(i >=0 && j<len){
            if(matrix[i][j] > target){
                i--;
            }
            else
            {
                count = count + i +1;
                j++;
            }
        }
        return count;
    }
}