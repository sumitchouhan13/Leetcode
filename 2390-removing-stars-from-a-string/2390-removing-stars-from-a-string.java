class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '*'){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        if(st.size() == 0){
            return "";
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}