class Solution {
    public String reverseWords(String s) {
        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for(String str : array){
            for(int i = str.length() - 1 ; i >= 0 ; i--){
                sb.append(str.charAt(i));
            }
            if(j < (array.length - 1)){
                sb.append(" ");
                j++;
            }
        }
        return sb.toString();
    }
}