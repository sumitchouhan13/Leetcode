class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int dif = target - nums[i];
            if(!hm.containsKey(dif)){
                hm.put(nums[i] , i);
            }else{
                res[0] = hm.get(dif);
                res[1] = i;
            }
        }
        return res;
    }
}