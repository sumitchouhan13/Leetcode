class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer , String> hm = new TreeMap<>(Collections.reverseOrder());
        for(int i = 0 ; i < names.length ; i++){
            hm.put(heights[i] , names[i]);
        }
        int i = 0;
        for(Map.Entry<Integer , String> map : hm.entrySet()){
            names[i] = map.getValue();
            i++;
        }
        return names;
    }
}