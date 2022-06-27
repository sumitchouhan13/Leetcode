class Solution {
    public int minPartitions(String n) {
        if(n == null){
            return 0;
        }
        int ans = 0;
        for(char ch : n.toCharArray()){
            ans = Math.max(ch - '0' , ans);
        }
        return ans;
    }
}