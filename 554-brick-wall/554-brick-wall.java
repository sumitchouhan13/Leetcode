class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(List<Integer> li : wall){
            int cut = 0;
            for(int i = 0 ; i < li.size() - 1 ; i++){
                cut += li.get(i);
                hm.put(cut , hm.getOrDefault(cut , 0) + 1);
            }
        }
        int max = 0;
        for(int val : hm.values()){
            max = Math.max(val , max);
        }
        return wall.size() - max;
    }
}