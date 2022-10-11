class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if(n < 2){
            return false;
        }
        int max = Integer.MAX_VALUE , min = Integer.MAX_VALUE;
        for(int e : nums){
            if(e <= min){
                min = e;
            }else if(e <= max){
                max = e;
            }else{
                return true;
            }
        }
        return false;
    }
}