class Solution {
    public long zeroFilledSubarray(int[] nums) {
        //Just observe the pattern of the zeroes starting from first zero
        // 1 -> 1
        // 2 -> 3
        // 3 -> 6
        // 4 -> 10
        // and so on
        // so the problem boils down to finding the max number of zeros from the subarray and calculating the total answer from it, the dp is the current index + dp[i - 1]
        long count = 0;
        int n = nums.length;
        HashMap<Long , Long> hm = new HashMap<>();
        int i = 0;
        while(i < n){
            if(nums[i] == 0){
                count++;
            }else{
                if(count != 0){
                    hm.put(count , hm.getOrDefault(count , 0l) + 1);
                }
                count = 0;
            }
            i++;
        }
        if(count != 0){
            hm.put(count , hm.getOrDefault(count , 0l) + 1);
        }
        // for(Map.Entry<Integer , Integer> map : hm.entrySet()){
        //     System.out.println(map.getKey() + " " + map.getValue());
        // }
        Long max = Long.MIN_VALUE;
        for(Long e : hm.keySet()){
            max = Math.max(e , max);
        }
        if(max == Long.MIN_VALUE){
            return 0;
        }
        long[] dp = new long[(int)(max + 1)];
        dp[0] = 0;
        dp[1] = 1;
        for(int j = 2 ; j < dp.length ; j++){
            dp[j] = j + dp[j - 1];
        }
        long ans = 0;
        for(Map.Entry<Long , Long> map : hm.entrySet()){
            long index = map.getKey();
            long key = dp[(int)index];
            long value = map.getValue();
            ans += (key * value);
        }
        return ans;
    }
}