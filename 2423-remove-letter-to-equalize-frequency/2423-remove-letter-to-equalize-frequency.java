class Solution {
    public boolean equalFrequency(String word) {
        int[] freq = new int[26];
        for(char ch : word.toCharArray()){
            freq[ch - 'a']++;
        }
        TreeMap<Integer , Integer> hm = new TreeMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int e : freq){
            if(e != 0){
                hm.put(e , hm.getOrDefault(e , 0) + 1);
                set.add(e);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        if(hm.size() >= 3){
            return false;
        }
        if(hm.size() == 1){
            if(list.get(0)==1){
                return true;
            }
            if(hm.get(list.get(0))==1){
                return true;
            }
        }
        if(hm.size()==2){
            if(hm.get(list.get(0)) == 1 && (list.get(0) == list.get(1) + 1 || list.get(0) == 1)){
                return true;
            }
            if(hm.get(list.get(1)) == 1 && (list.get(0) + 1 == list.get(1) || list.get(1) == 1)){
                return true;
            }
        }
        return false;
    }
}