class Solution {
    public String maxValue(String n, int x) {
        StringBuilder pre = new StringBuilder(n);
        int len = n.length();
        int i = n.charAt(0) == '-' ? 1 : 0;
        while(i < len){
            char ch = n.charAt(i);
            int num = ch - '0';
            if(n.charAt(0) != '-' ? num < x : num > x){
                break;
            }
            i++;
        }
        pre.insert(i , x);
        // if(n.charAt(0) != '-'){
        //     int i = 0;
        //     while(i < len){
        //         char ch = n.charAt(i);
        //         int num = ch - '0';
        //         if(num < x){
        //             break;
        //         }
        //         i++;
        //     }
        //     pre.insert(i , x);
        // }else{
        //     int i = 1;
        //     while(i < len){
        //         char ch = n.charAt(i);
        //         int num = ch - '0';
        //         if(num > x){
        //             break;
        //         }
        //         i++;
        //     }
        //     pre.insert(i , x);
        // }
        return pre.toString();
    }
}