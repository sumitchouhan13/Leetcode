class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max = -1 , currMax = values[0] , n = values.length;
        for(int i = 1 ; i < n ; i++){
            int tempMax = currMax + (values[i] - i);
            max = Math.max(tempMax , max);
            currMax = Math.max(currMax , values[i] + i);
        }
        return max;
    }
}