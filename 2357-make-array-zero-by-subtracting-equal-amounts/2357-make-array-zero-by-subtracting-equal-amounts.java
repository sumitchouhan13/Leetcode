class Solution {
    public int minimumOperations(int[] nums) {
        TreeSet<Integer> hs = new TreeSet<>();
        for(int e : nums){
            if(e != 0){
                hs.add(e);
            }
        }
        return hs.size();
    }
}