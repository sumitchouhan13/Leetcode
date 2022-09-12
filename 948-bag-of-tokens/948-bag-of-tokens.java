class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int low = 0 , high = tokens.length - 1;
        int points = 0 , ans = 0;
        while(low <= high && (power >= tokens[low] || points > 0)){
            while(low <= high && power >= tokens[low]){
                power -= tokens[low++];
                points++;
            }
            ans = Math.max(ans , points);
            if(low <= high && points > 0){
                power += tokens[high--];
                points--;
            }
        }
        return ans;
    }
}