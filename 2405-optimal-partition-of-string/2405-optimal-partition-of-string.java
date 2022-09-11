class Solution {
    public int partitionString(String s) {
        // int count = 0;
        // HashMap<Character , Integer> hm = new HashMap<>();
        // int i = 0 , j = 0 , n = s.length();
        // while(i < n && j < n){
        //     if(!hm.containsKey(s.charAt(j))){
        //         hm.put(s.charAt(j) , j);
        //         j++;
        //     }else{
        //         int val = hm.get(s.charAt(j));
        //         if(val <= j){
        //             hm.put(s.charAt(j) , j);
        //             i = j;
        //             j++;
        //             count++;
        //         }
        //     }
        // }
        // return count + 1;
        int[] position = new int[26];
        int res = 0 , last = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(position[s.charAt(i) - 'a'] >= last){
                ++res;
                last = i + 1;
            }
            position[s.charAt(i) - 'a'] = i + 1;
        }
        return res;
    }
}