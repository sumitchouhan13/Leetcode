class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        int len = nums.length , min = Integer.MIN_VALUE;
        for(int i = 0 ; i < len - 1 ; i++){
            if(nums[i] <= nums[i + 1]){
                min = nums[i];
            }else{
                if(nums[i + 1] < min){
                    nums[i + 1] = nums[i];
                }
                count++;
                if(count > 1){
                    return false;
                }
            }
        }
        return true;
    }
}