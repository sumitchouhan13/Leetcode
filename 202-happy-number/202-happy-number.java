class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while(n != 1){
            n = sum(n);
            if(hs.contains(n))
                return false;
            hs.add(n);
        }
        return true;
    }
    private int sum(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }
}