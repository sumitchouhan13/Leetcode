class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String , Integer> hm = new HashMap<>();
        for(String word : words){
            hm.put(word , hm.getOrDefault(word , 0) + 1);
        }
        int answer = 0;
        boolean middle = false;
        for(Map.Entry<String , Integer> map : hm.entrySet()){
            String word = map.getKey();
            int value = map.getValue();
            if(word.charAt(0) == word.charAt(1)){
                if(value % 2 == 0){
                    answer += value;
                }else{
                    answer += value - 1;
                    middle = true;
                }
            }else if(word.charAt(0) < word.charAt(1)){
                String reverseWord = "" + word.charAt(1) + word.charAt(0);
                if(hm.containsKey(reverseWord)){
                    answer += 2 * Math.min(value , hm.get(reverseWord));
                }
            }
        }
        if(middle){
            answer++;
        }
        return 2 * answer;
    }
}