class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1 , 1);
        Arrays.fill(dp2 , 1);
        for(int i = 1 ; i < n ; i++){
            if(nums[i - 1] >= nums[i]){
                dp1[i] = dp1[i - 1] + 1;
            }
        }
        for(int i = n - 2 ; i >= 0 ; i--){
            if(nums[i] <= nums[i + 1]){
                dp2[i] = dp2[i + 1] + 1;
            } 
        }
        for(int i = k ; i < n - k ; i++){
            if(dp1[i - 1] >= k && dp2[i + 1] >= k){
                res.add(i);
            }
        }
        return res;
    }
}