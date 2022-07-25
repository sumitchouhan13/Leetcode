class Solution {
    public char repeatedCharacter(String s) {
        int[] ar = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            ar[ch - 'a']++;
            if(ar[ch - 'a'] == 2){
                return ch;
            }
        }
        return '1';
    }
}