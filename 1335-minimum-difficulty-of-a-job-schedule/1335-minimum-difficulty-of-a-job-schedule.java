class Solution {
    public int minDifficulty(int[] jobDifficulty, int D) {
        
        int n = jobDifficulty.length;
        int[][] dp = new int[D][n];
        
        if(D>n) return -1;
        
        /* dp[d][j] = difficulty to perform jobs [j, n-1] with d+1 days remaining*/
        dp[0][n-1] = jobDifficulty[n-1];
        
        /* With one day remaining dp[0][j] equals to the max difficulty for jobs in range [j, n-1]*/
        for(int i = n-2; i >= 0; i--){
            dp[0][i] = Math.max(jobDifficulty[i],dp[0][i+1]);
        }
        
        for(int d = 1; d < D; d++){
            /*Building dp with d+1 days remaining for all indexes*/
            
            for(int i = 0; i < n-d; i++){
                /* maxD is max difficulty of jobs in range[i : j] 
				dp[d-1][j+1] si difficulty of performing the remaining jobs with the remaining days*/
                int maxD = 0;
                dp[d][i] = Integer.MAX_VALUE;
                
                for(int j = i; j < n-d; j++){
                    maxD = Math.max(maxD, jobDifficulty[j]);
                    dp[d][i] = Math.min(maxD + dp[d-1][j+1], dp[d][i]);
                }
            }            
        }
        
        return dp[D-1][0];
    }
}