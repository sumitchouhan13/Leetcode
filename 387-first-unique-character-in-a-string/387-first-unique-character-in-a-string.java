class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character , Integer> hm = new LinkedHashMap<>();
        for(char ch : s.toCharArray()){
            hm.put(ch , hm.getOrDefault(ch , 0) + 1);
        }
        char res = 'A';
        for(Map.Entry<Character , Integer> map : hm.entrySet()){
            if(map.getValue() == 1){
                res = map.getKey();
                break;
            }
        }
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == res){
                return i;
            }
        }
        return -1;
    }
}