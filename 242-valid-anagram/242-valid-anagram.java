class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length() == 0 || t.length() == 0){
            return true;
        }
        if(s.length() != t.length()){
            return false;
        }
        int[] ar = new int[26];
        for(char ch : s.toCharArray()){
            ar[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            ar[ch - 'a']--;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(ar[i] >= 1){
                return false;
            }
        }
        return true;
    }
}