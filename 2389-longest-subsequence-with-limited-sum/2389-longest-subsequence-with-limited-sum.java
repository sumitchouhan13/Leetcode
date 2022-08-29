class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        // Arrays.sort(nums);
        // for(int i = 0 ; i < queries.length ; i++){
        //     int sum = 0 , index = -1;
        //     for(int j = 0 ; j < nums.length ; j++){
        //         sum += nums[j];
        //         if(sum > queries[i]){
        //             break;
        //         }
        //         index = j;
        //     }
        //     queries[i] = index + 1;
        // }
        // return queries;
        int m = queries.length, n = nums.length, i = 0;
        Arrays.sort(nums);
        int[] prefixSum = new int[n + 1];
        for (int num : nums) {
            prefixSum[i + 1] = prefixSum[i++] + num;
        }
        i = 0;
        int[] ans = new int[m];
        for (int q : queries) {
            ans[i++] = findIndex(prefixSum, q) - 1;
        }
        return ans;
    }
    public int findIndex(int[] nums , int toFind){
        int low = 0 , high = nums.length;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(nums[mid] <= toFind){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}