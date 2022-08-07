class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer , Integer> hm = new TreeMap<>();
        for(int[] ar : items1){
            int key = ar[0] , value = ar[1];
            hm.put(key , value);
        }
        for(int[] ar : items2){
            int key = ar[0] , value = ar[1];
            int value1 = hm.get(key) == null ? 0 : hm.get(key);
            hm.put(key , value + value1);
        }
        // for(Map.Entry<Integer , Integer> map : hm.entrySet()){
        //     System.out.println(map.getKey() + " " + map.getValue());
        // }
        List<List<Integer>> res = new ArrayList<>();
        for(Map.Entry<Integer , Integer> map : hm.entrySet()){
            List<Integer> temp = new ArrayList<>();
            temp.add(map.getKey());
            temp.add(map.getValue());
            res.add(temp);
        }
        return res;
    }
}