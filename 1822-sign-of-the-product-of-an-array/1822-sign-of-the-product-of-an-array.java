class Solution {
    public int arraySign(int[] nums) {
        int pro = 1;
        for(int e : nums){
            if(e == 0){
                return 0;
            }else if(e < 0){
                pro *= -1;
            }else{
                pro *= 1;
            }
        }
        return pro;
    }
}