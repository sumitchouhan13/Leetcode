class Solution {
    public boolean hasAllCodes(String s, int k) {
        int totalCode = 1 << k;
        HashSet<String> hs = new HashSet<>();
        for(int i = k ; i <= s.length() ; i++){
            String str = s.substring(i - k , i);
            if(!hs.contains(str)){
                hs.add(str);
                totalCode--;
                if(totalCode == 0){
                    return true;
                }
            }
        }
        return false;
    }
}