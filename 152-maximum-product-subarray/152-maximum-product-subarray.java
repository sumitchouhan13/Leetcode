class Solution {
    public int maxProduct(int[] nums) {
        int maxOverall = nums[0];
        int maxEnding = nums[0] , minEnding = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            int temp = maxEnding;
            maxEnding = Math.max(nums[i] , Math.max(maxEnding * nums[i] , minEnding * nums[i]));
            minEnding = Math.min(nums[i] , Math.min(nums[i] * temp , minEnding * nums[i]));
            maxOverall = Math.max(maxOverall , maxEnding);
        }
        return maxOverall;
    }
}