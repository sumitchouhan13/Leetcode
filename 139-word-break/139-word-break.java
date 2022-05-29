class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s == null || s.length() == 0){
            return true;
        }
        HashSet<String> hs = new HashSet<>();
        for(int i = 0 ; i < wordDict.size() ; i++){
            hs.add(wordDict.get(i));
        }
        int[] dp = new int[s.length()];
        for(int i = 0 ; i < dp.length ; i++){
            for(int j = 0 ; j <= i ; j++){
                String wordCheck = s.substring(j , i + 1);
                if(hs.contains(wordCheck)){
                    if(j > 0){
                        dp[i] += dp[j - 1];
                    }else{
                        dp[i] += 1;
                    }
                }
            }
        }
        return dp[s.length() - 1] > 0; //If the last element is greater than 0 then we can create word from that wordDict
    }
}