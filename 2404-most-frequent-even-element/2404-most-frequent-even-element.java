class Solution {
    public int mostFrequentEven(int[] nums) {
        TreeMap<Integer , Integer> hm = new TreeMap<>();
        for(int e : nums){
            if(e % 2 == 0){
                hm.put(e , hm.getOrDefault(e , 0) + 1);
            }
        }
        if(hm.size() == 0){
            return -1;
        }
        int elem = Integer.MAX_VALUE , freq = 0;
        for(Map.Entry<Integer , Integer> map : hm.entrySet()){
            if(freq < map.getValue()){
                freq = map.getValue();
                elem = map.getKey();
            }
        }
        return elem;
    }
}