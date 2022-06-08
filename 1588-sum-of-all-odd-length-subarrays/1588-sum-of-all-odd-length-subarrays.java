class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        if(arr == null || arr.length == 0)
            return 0;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i += 2){
            for(int j = 0 ; j < arr.length ; j++){
                if(j + i < arr.length){
                    for(int k = 0 ; k <= i ; k++){
                        sum += arr[(j + k)];
                    }
                }
            }
        }
        return sum;
    }
}