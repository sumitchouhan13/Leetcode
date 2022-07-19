class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if(nums == null || nums.length == 0){
            return res;
        }
        // for(int i = 0 ; i < nums.length - 1 ; i++){
        //     for(int j = i + 1 ; j < nums.length ; j++){
        //         if(nums[i] + nums[j] == target){
        //             res[0] = i;
        //             res[1] = j;
        //             break;
        //         }
        //     }
        // }
        // return res;
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int dif = target - nums[i];
            if(!hm.containsKey(dif)){
                hm.put(nums[i] , i);
            }else{
                res[0] = hm.get(dif);
                res[1] = i;
                break;
            }
        }
        return res;
    }
}