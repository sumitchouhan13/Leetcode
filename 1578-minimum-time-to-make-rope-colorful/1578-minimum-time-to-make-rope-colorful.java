class Solution {
    public int minCost(String colors, int[] neededTime) {
        int i = 0 , j = 0;
        int totalTime = 0 , n = colors.length();
        while(i < n && j < n){
            int currTotal = 0 , currMax = 0;
            while(j < n && colors.charAt(i) == colors.charAt(j)){
                currTotal += neededTime[j];
                currMax = Math.max(currMax , neededTime[j]);
                j++;
            }
            totalTime += currTotal - currMax;
            i = j;
        }
        return totalTime;
    }
}