class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character , Integer> hm = new HashMap<>();
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            if(hm.containsKey(s.charAt(i))){
                int ind = hm.get(s.charAt(i));
                int dist = i - ind - 1;
                if(distance[s.charAt(i) - 'a'] != dist){
                    return false;
                }
            }else{
                hm.put(s.charAt(i) , i);
            }
        }
        return true;
    }
}