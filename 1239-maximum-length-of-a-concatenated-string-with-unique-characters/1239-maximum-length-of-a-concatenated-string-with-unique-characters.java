class Solution {
    private boolean isUnique(String str) {
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (seen.contains(curr)) return false;
            seen.add(curr);
        }
        return true;
    }
    
    public int maxLength(List<String> arr) {
        List<String> combos = new ArrayList<>();
        combos.add("");
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int size = combos.size();
            for (int j = 0; j < size; j++) {                
                String c = combos.get(j) + arr.get(i);
                if (isUnique(c)) {
                    combos.add(c);
                    max = Math.max(max, c.length());
                }
            }
        }
        return max;
    }
}