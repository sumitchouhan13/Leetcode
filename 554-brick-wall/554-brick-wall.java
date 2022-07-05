class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int wallSize = 0;
        for(int j = 0 ; j < 1 ; j++){
            for(int i = 0 ; i < wall.get(j).size() ; i++){
                wallSize += wall.get(j).get(i);
            }
        }
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