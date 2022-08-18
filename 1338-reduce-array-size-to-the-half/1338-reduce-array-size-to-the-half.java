class Solution {
    public int minSetSize(int[] arr) {
        // We are just iterating over the array and storing the frequencies of the elements in the hashmap and after that we are storing the values of the elements in the max heap and start removing the elements with the maximum frequency until the size of the array is at least half
        int n = arr.length;
        if(n == 1 || n == 2){
            return 1;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int e : arr){
            hm.put(e , hm.getOrDefault(e , 0) + 1);
        }
        for(int e : hm.values()){
            pq.offer(e);
        }
        int res = 0 , count = 0;
        while(res < n / 2 && pq.size() > 0){
            res += pq.poll();
            count++;
        }
        return count;
    }
}