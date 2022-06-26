class Solution {
    //Explanation
    //  https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/discuss/2198002/C%2B%2B-Solution-Using-Sliding-Window
    public int maxScore(int[] cardPoints, int k) {
        int res = 0;
        for(int i= 0 ; i < k ; i++){
            res += cardPoints[i];
        }
        int curr = res , n = cardPoints.length;
        for(int i = k - 1 ; i >= 0 ; i--){
            curr -= cardPoints[i];
            curr += cardPoints[n - k + i];
            res = Math.max(res , curr);
        }
        return res;
    }
}

// eg. [1,2,3,4,5,6,1] , k = 3;
// res = 6;
// for loop:
//      curr = 3;
//      curr = 4;
//      res = 6;
//      curr = 2;
//      curr = 8;
//      res = 8;
//      curr = 7;
//      curr = 12;
//      res = 12;
//  End of For Loop
// res = 12;