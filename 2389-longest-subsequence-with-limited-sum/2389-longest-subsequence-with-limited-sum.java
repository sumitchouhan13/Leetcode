class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for(int i = 0 ; i < queries.length ; i++){
            int sum = 0 , index = -1;
            for(int j = 0 ; j < nums.length ; j++){
                sum += nums[j];
                if(sum > queries[i]){
                    break;
                }
                index = j;
            }
            queries[i] = index + 1;
        }
        return queries;
    }
}