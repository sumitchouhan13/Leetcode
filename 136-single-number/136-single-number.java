class Solution {
    public int singleNumber(int[] nums) {
        int xor = nums[0] , n = nums.length;
        for(int i = 1 ; i < n ; i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
}