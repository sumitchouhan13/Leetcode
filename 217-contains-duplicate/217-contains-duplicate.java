class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums){
            if(!hs.contains(i)){
                hs.add(i);
            }else{
                return true;
            }
        }
        return false;
    }
}