class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0 , pro = 1;
        while(n != 0){
            int temp = n % 10;
            sum += temp;
            pro *= temp;
            n = n / 10;
        }
        return pro - sum;
    }
}