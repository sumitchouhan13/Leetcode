class Solution {
    public boolean isEven(int num){
        int digit = 0;
        while(num != 0){
            int temp = num % 10;
            num = num / 10;
            digit++;
        }
        return digit % 2 == 0 ? true : false;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(isEven(nums[i])){
                count++;
            }
        }
        return count;
    }
}