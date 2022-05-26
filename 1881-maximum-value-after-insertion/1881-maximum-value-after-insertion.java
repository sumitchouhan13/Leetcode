class Solution {
    public String maxValue(String n, int x) {
        StringBuilder pre = new StringBuilder(n);
        int len = n.length();
        if(n.charAt(0) != '-'){
            int i = 0;
            while(i < len){
                char ch = n.charAt(i);
                int num = ch - '0';
                if(num < x){
                    break;
                }
                i++;
            }
            pre.insert(i , x);
        }else{
            int i = 1;
            while(i < len){
                char ch = n.charAt(i);
                int num = ch - '0';
                if(num > x){
                    break;
                }
                i++;
            }
            pre.insert(i , x);
        }
        return pre.toString();
    }
}