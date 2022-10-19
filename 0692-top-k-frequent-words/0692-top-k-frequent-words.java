class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String , Integer> hm = new HashMap<>();
        int len = words.length;
        for(int i = 0 ; i < len ; i++){
            hm.put(words[i] , hm.getOrDefault(words[i] , 0) + 1);
        }
        List<String> res = new ArrayList<>();
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                 (a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue()
        );
        for(Map.Entry<String, Integer> entry: hm.entrySet())
        {
            pq.offer(entry);
            if(pq.size()>k)
                pq.poll();
        }
        while(!pq.isEmpty())
            res.add(0, pq.poll().getKey());
        return res;
    }
}