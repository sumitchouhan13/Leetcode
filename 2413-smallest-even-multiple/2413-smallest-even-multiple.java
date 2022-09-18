class Solution {
    public int smallestEvenMultiple(int n) {
        int ans = 0;
        int i = 2;
        while(true){
            if(i % 2 == 0 && i % n == 0){
                ans = i;
                break;
            }
            i++;
        }
        return ans;
    }
}