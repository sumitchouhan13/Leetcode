class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int count = 0 , n = nums.length;
        int mid = nums[n / 2];
        for(int e : nums){
            count += Math.abs(mid - e);
        }
        return count;
    }
}