class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0 , len = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > max){
                max = nums[i];
                len = 1;
                while(i < nums.length - 1 && nums[i] == nums[i + 1]){
                    i++;
                    len++;
                }
            }else if(nums[i] == max){
                int temp = 1;
                while(i < nums.length - 1 && nums[i] == nums[i + 1]){
                    i++;
                    temp++;
                }
                len = Math.max(len , temp);
            }
        }
        return len;
    }
}