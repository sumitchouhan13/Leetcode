class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans = new int[queries.length];
        int sum = arraySumMethod(nums);
        int i = 0;
        for(int[] query : queries){
            int index = query[1];
            int value = query[0];
            if(nums[index] % 2 == 0){
                sum -= nums[index];
            }
            nums[index] += value;
            if(nums[index] % 2 == 0){
                sum += nums[index];
            }
            ans[i++] = sum;
        }
        return ans;
    }
    public int arraySumMethod(int[] nums){
        int sum = 0;
        for(int e : nums){
            if(e % 2 == 0){
                sum += e;
            }
        }
        return sum;
    }
}