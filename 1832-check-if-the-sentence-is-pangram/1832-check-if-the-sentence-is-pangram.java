class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] ar = new int[26];
        for(char ch : sentence.toCharArray()){
            ar[ch - 'a']++;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(ar[i] == 0){
                return false;
            }
        }
        return true;
    }
}