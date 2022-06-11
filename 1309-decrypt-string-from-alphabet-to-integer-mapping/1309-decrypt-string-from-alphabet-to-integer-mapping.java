class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            if(i < n - 2 && s.charAt(i + 2) == '#'){
                int a = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');
                sb.append((char)(a + 96));
                i += 2;
            }else{
                int a = (s.charAt(i) - '0');
                sb.append((char)(a + 96));
            }
        }
        return sb.toString();
    }
}