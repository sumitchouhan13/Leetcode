class Solution {
    public String largestPalindromic(String num) {
        int[] freq = new int[10];
        for(char ch : num.toCharArray()){
            freq[ch - '0']++;
        }
        boolean single = false;
        StringBuilder pre = new StringBuilder();
        StringBuilder post = new StringBuilder();
        StringBuilder middle = new StringBuilder();
        for(int i = 9 ; i >= 0 ; i--){
            if(freq[i] % 2 != 0 && !single){
                middle.append(i);
                single = !single;
            }
            if(i == 0 && pre.length() == 0){
                if(freq[i] > 0 && middle.length() == 0){
                    middle.append(i);
                }
                return middle.toString();
            }
            for(int j = 0 ; j < freq[i] / 2 ; j++){
                pre.append(i);
                post.append(i);
            }
        }
        post.reverse();
        pre.append(middle);
        pre.append(post);
        return pre.toString();
    }
}