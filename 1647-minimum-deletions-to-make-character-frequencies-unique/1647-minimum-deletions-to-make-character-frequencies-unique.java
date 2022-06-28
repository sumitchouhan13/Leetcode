class Solution {
    public int minDeletions(String s) {
        int[] ar  = new int[26];
        int count = 0;
        for(char ch : s.toCharArray()){
            ar[ch - 'a']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int e : ar){
            if(e > 0){
                pq.offer(e);
            }
        }
        while(pq.size() > 1){
            int first = pq.remove();
            int second = pq.remove();
            if(first == second){
                second--;
                count++;
                pq.add(first);
            }
            if(second > 0){
                pq.add(second);
            }
        }
        return count;
    }
}