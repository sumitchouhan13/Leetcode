class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0) return false;
        if(x==revert(x)) return true;
        return false;
    }
    public int revert(int x)
    {
        int rev = 0;
        while(x!=0)
        {
            int last = x%10;
            rev = rev*10 + last;
            x /= 10;
        }
        return rev;
    }
}