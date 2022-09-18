class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        PriorityQueue<int[]> task = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        
        for(int i=0; i<profit.length; i++)
            task.offer(new int[]{difficulty[i], profit[i]});
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i: worker)
            pq.offer(i);
        
        int sum = 0;
        
        while(!pq.isEmpty() && !task.isEmpty()){
            if(pq.peek() >= task.peek()[0]){
                while(!pq.isEmpty() && task.peek()[0] <= pq.peek()){
                    sum += task.peek()[1];
                    pq.poll();
                }
            }
            else{
                while(!task.isEmpty() && task.peek()[0] > pq.peek())
                    task.poll();
            }
        }
        
        return sum;
    }
}