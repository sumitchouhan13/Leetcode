class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if(word1 == null || word2 == null)
            return false;
        String a = "";
        String b = "";
        for(int i = 0 ; i < word1.length ; i++){
            a += word1[i];
        }
        for(int i = 0 ; i < word2.length ; i++){
            b += word2[i];
        }
        boolean found = true;
        if(a.length() != b.length())
            return false;
        for(int i = 0 ; i < a.length() ; i++){
            if(a.charAt(i) != b.charAt(i)){
                found = false;
                break;
            }
        }
        return found;
    }
}