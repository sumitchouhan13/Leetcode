class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int[] ar : matrix){
            for(int e : ar){
                pq.add(e);
            }
        }
        while(k-- > 1){
            pq.poll();
        }
        return pq.poll();
    }
}