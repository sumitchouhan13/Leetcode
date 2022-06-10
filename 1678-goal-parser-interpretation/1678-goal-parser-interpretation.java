class Solution {
    public String interpret(String command) {
        int i = 0 , n = command.length();
        StringBuilder sb = new StringBuilder();
        while(i < n){
            if(command.charAt(i) == 'G'){
                sb.append("G");
            }else if(command.charAt(i) == '(' && command.charAt(i + 1) == 'a'){
                sb.append("al");
                i += 3;
            }else{
                sb.append("o");
                i++;
            }
            i++;
        }
        return sb.toString();
    }
}