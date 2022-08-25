class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote == null || magazine == null){
            return false;
        }
        int[] ar = new int[26];
        for(char ch : ransomNote.toCharArray()){
            ar[ch - 'a']++;
        }
        for(char ch : magazine.toCharArray()){
            ar[ch - 'a']--;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(ar[i] > 0){
                return false;
            }
        }
        return true;
    }
}