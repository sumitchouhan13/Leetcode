class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        if(n == 1){
            return 0;
        }
        int res = 0 , max = 0;
        char[] ch = colors.toCharArray();
        for(int i = 1 ; i < ch.length ; i++){
            if(ch[max] == ch[i]){
                res += Math.min(neededTime[max] , neededTime[i]);
                if(neededTime[max] < neededTime[i]){
                    max = i;
                }
            }else{
                max = i;
            }
        }
        return res;
    }
}