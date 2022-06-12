class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int l = 0 , r = 0;
        int sum = 0 , ans = 0;
        HashSet<Integer> hs = new HashSet<>();
        while(l < n && r < n){
            if(!hs.contains(nums[r])){
                sum += nums[r];
                ans = Math.max(sum , ans);
                hs.add(nums[r++]);
            }else{
                sum -= nums[l];
                hs.remove(nums[l++]);
            }
        }
        return ans;
    }
}