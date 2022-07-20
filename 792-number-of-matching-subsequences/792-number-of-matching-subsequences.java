class Solution {
    public boolean chechSubsequence(String word , String s){
        int i = 0 , j = 0;
        while(i < s.length() && j < word.length()){
            if(word.charAt(j) == s.charAt(i)){
                j++;
            }
            i++;
        }
        return j == word.length();
    }
    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        HashSet<String> hs1 = new HashSet<>();
        HashSet<String> hs2 = new HashSet<>();
        for(String word : words){
            if(hs2.contains(word)){
                continue;
            }
            if(hs1.contains(word)){
                count++;
            }else{
                if(chechSubsequence(word , s)){
                    hs1.add(word);
                    count++;
                }else{
                    hs2.add(word);
                }
            }
        }
        return count;
    }
}