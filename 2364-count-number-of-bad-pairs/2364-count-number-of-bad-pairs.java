class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int n = nums.length;
        // for(int i = 0 ; i < n ; i++){
        //     int value = i - nums[i];
        //     hm.put(value , hm.getOrDefault(value , 0) + 1);
        // }
        // long count = 0;
        // for(int i = 0 ; i < n - 1 ; i++){
        //     int value = hm.get(i - nums[i]) == null ? 0 : (hm.get(i - nums[i]) > 1 
        //                                                    ? hm.get(i - nums[i]) - 1 : hm.get(i - nums[i]));
        //     count += (n - value - (i + 1));
        // }
        // return count > 0 ? count : 0;
        long count = 0;
        for(int i = 0 ; i < n ; i++){
            int diff = i - nums[i];
            if(hm.containsKey(diff)){
                count += (i - hm.get(diff));
            }else{
                count += i;
            }
            hm.put(diff , hm.getOrDefault(diff , 0) + 1);
        }
        return count;
    }
}