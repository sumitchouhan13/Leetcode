class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int[] ar = new int[26];
        for(char ch : p.toCharArray()){
            ar[ch - 'a']++;
        }
        int n = s.length() - p.length();
        int m = p.length();
        for(int i = 0 ; i <= n ; i++){
            String str = s.substring(i , m + i);
            int[] ar1 = new int[26];
            for(char ch : str.toCharArray()){
                ar1[ch - 'a']++;
            }
            if(Arrays.equals(ar , ar1)){
                res.add(i);
            }
        }
        return res;
    }
}