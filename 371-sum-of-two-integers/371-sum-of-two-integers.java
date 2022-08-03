class Solution {
    public int getSum(int a, int b) {
        int carry=a & b;
        int sum= a^b;
        while( carry!=0){
            carry=carry<<1;
            int temp= sum;
            sum= sum^carry;
            carry= temp & carry;
        }
        return sum;
    }
}