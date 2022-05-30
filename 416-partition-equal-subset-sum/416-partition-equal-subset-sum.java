class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int e : nums){
            sum += e;
        }
        if(sum % 2 != 0){
            return false;
        }
        int n = nums.length;
        int k = sum / 2;
        int[][] dp = new int[n][k + 1];
        for(int[] ar : dp){
            Arrays.fill(ar , -1);
        }
        // return recursion(n - 1 , sum / 2 , nums);
        return memo(n - 1 , k , nums , dp);
    }
    // public boolean recursion(int index , int target , int[] nums){
    //     if(target == 0){
    //         return true;
    //     }
    //     if(index == 0){
    //         return nums[index] == target;
    //     }
    //     boolean notTaken = recursion(index - 1 , target , nums);
    //     boolean taken = false;
    //     if(nums[index] <= target){
    //         taken = recursion(index - 1 , target - nums[index] , nums);
    //     }
    //     return taken || notTaken;
    // }
    public boolean memo(int index , int target , int[] nums , int[][] dp){
        if(target == 0){
            return true;
        }
        if(index == 0){
            return nums[index] == target;
        }
        if(dp[index][target] != -1){
            return dp[index][target] == 0 ? false : true;
        }
        boolean notTaken = memo(index - 1 , target , nums , dp);
        boolean taken = false;
        if(nums[index] <= target){
            taken = memo(index - 1 , target - nums[index] , nums , dp);
        }
        dp[index][target] = taken || notTaken ? 1 : 0;
        return taken || notTaken;
    }
}