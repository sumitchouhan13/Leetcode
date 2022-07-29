class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for(String word : words){
            if(match(word , pattern)){
                res.add(word);
            }
        }
        return res;
    }
    public boolean match(String word , String pattern){
        HashMap<Character , Character> a = new HashMap<>();
        HashMap<Character , Character> b = new HashMap<>();
        for(int i = 0 ; i < word.length() ; i++){
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            if(!a.containsKey(w)){
                a.put(w , p);
            }
            if(!b.containsKey(p)){
                b.put(p , w);
            }
            if(a.get(w) != p || b.get(p) != w){
                return false;
            }
        }
        return true;
    }
}