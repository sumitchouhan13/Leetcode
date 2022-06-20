class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = getFinalString(s);
        String s2 = getFinalString(t);
        return s1.equals(s2);
    }
    private String getFinalString(String s){
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != '#'){
                st.push(ch);
            }else if(!st.isEmpty()){
                st.pop();
            }
        }
        return String.valueOf(st);
    }
}