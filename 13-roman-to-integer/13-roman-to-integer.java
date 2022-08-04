class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map= new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int count = 0 , n = s.length() , ans = 0;
        for(int i = 0 ; i < n - 1 ; i++){
            char curr = s.charAt(i) , next = s.charAt(i + 1);
            if(map.get(curr) < map.get(next)){
                i++;
                count += 2;
                ans += map.get(next) - map.get(curr);
            }else{
                count++;
                ans += map.get(curr);
            }
        }
        if(count == n){
            return ans;
        }
        return ans + map.get(s.charAt(n - 1));
    }
}
