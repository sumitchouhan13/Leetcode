class Solution {
    public char findTheDifference(String s, String t) {
        int[] ar = new int[26];
        for(char ch : s.toCharArray()){
            ar[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            ar[ch - 'a']--;
        }
        char res = 'a';
        for(int i = 0 ; i < 26 ; i++){
            if(ar[i] != 0){
                res = (char)(i + 97);
                break;
            }
        }
        return res;
    }
}