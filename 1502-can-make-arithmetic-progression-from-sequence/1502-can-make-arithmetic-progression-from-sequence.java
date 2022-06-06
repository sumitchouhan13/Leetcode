class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if(n <= 2){
            return true;
        }
        boolean found = true;
        for(int i = 1 ; i < n - 1 ; i++){
            int dif1 = arr[i] - arr[i - 1];
            int dif2 = arr[i + 1] - arr[i];
            if(dif1 != dif2){
                found = false;
            }
        }
        return found;
    }
}