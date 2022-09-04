class Solution {
    public boolean findSubarrays(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        int i = 0 , j = i + 1;
        while(i < n - 1){
            int sum = nums[i] + nums[j];
            if(hs.contains(sum)){
                return true;
            }else{
                hs.add(sum);
            }
            i++;
            j++;
        }
        return false;
    }
}