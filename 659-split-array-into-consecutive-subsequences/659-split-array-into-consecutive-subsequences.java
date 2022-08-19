class Solution {
    public boolean isPossible(int[] nums) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>(); // key -> last value of the subsequence, val -> number of elements in that subsequence (size of the subsequence). There can be one or more than one subsequence which last value is same.
        
        for(int i: nums){
            
            int n = 0; // number of elements in the subsequence which last value is (i-1). 0 in case of if there is no subsequence which last value is (i-1).
            if(map.containsKey(i-1)){
                
                Queue<Integer> pq = map.get(i-1);
                n = pq.poll(); // number of elements in the subsequence which last value is (i-1). 
                if(pq.isEmpty()) map.remove(i-1); // if now PriorityQueue is empty i.e. there is no subsequence which last value is (i-1) because we are appending (i) to this subsequence.
            }
            if(!map.containsKey(i)) map.put(i, new PriorityQueue<>());
            map.get(i).add(n+1);
        }
        
        for(PriorityQueue<Integer> pq: map.values()){
            
            while(!pq.isEmpty()){
                
                if(pq.poll() < 3) return false;
            }
        }
        return true;
    }
}