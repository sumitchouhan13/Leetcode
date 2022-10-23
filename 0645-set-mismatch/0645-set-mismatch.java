class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = -1 , sum = 0;
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int e : nums){
            if(hs.contains(e)){
                dup = e;
            }else{
                hs.add(e);
            }
            sum += e;
        }
        int[] res = new int[2];
        res[0] = dup;
        res[1] = ((n * (n + 1) / 2) - sum) + dup;
        return res;
    }
}