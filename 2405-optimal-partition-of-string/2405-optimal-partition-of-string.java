class Solution {
    public int partitionString(String s) {
        int count = (s.isEmpty()) ? 0 : 1;
        int n = s.length();
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            if(hs.contains(s.charAt(i))){
                hs.clear();
                count++;
            }
            hs.add(s.charAt(i));
        }
        return count;
    }
}