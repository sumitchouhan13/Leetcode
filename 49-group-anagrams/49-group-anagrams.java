class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String temp = new String(c);
            map.computeIfAbsent(temp , k -> new ArrayList<>());
            map.get(temp).add(s);
        }
        return new ArrayList<>(map.values());
    }
}