class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return res;
        }
        Arrays.sort(nums); //Sorting the array to avoid usage of extra space just to avoid duplicates
        for(int i = 0 ; i < nums.length - 2 ; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i - 1])){ //to avoid duplicates
                int low = i + 1 , high = nums.length - 1 , sum = 0 - nums[i];
                while(low < high){
                    if(nums[low] + nums[high] == sum){
                        res.add(Arrays.asList(nums[i] , nums[low] , nums[high]));
                        while(low < high && nums[low] == nums[low + 1]){
                            low++; //Moving the pointer to the right to avoid duplicates
                        }
                        while(low < high && nums[high] == nums[high - 1]){
                            high--; //Moving the pointer to the left to avoid duplicates
                        }
                        low++;
                        high--;
                    }else if(nums[low] + nums[high] < sum){ //Case when the value is smaller then required
                        low++;
                    }else{ //Case when the value is greater then required
                        high--;
                    }
                }
            }
        }
        return res; //T.C = O(NlogN) + O(N * N)
    }
}