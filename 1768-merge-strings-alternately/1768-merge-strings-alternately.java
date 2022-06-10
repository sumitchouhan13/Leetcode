class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0 , j = 0;
        int l1 = word1.length() , l2 = word2.length();
        boolean alternate = true;
        while(i < l1 && j < l2){
            if(alternate){
                sb.append(word1.charAt(i));
                i++;
                alternate = !alternate;
            }else{
                sb.append(word2.charAt(j));
                j++;
                alternate = !alternate;
            }
        }
        if(i < l1){
            sb.append(word1.substring(i , l1));
        }
        if(j < l2){
            sb.append(word2.substring(j , l2));
        }
        return sb.toString();
    }
}