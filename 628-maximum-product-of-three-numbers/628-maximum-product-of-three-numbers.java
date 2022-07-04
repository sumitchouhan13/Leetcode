class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int max2 = nums[0] * nums[1] * nums[2];
        int max3 = nums[0] * nums[1] * nums[n - 1];
        int max4 = nums[0] * nums[n - 2] * nums[n - 1];
        return Math.max(max1 , Math.max(max2 , Math.max(max3 , max4)));
    }
}