class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch >= 'A' && ch <= 'Z'){
                sb.append((char)(ch - 'A' + 97));
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}