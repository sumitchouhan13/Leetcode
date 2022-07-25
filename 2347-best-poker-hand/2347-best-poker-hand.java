class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashSet<Character> hs = new HashSet<>();
        for(char ch : suits){
            hs.add(ch);
        }
        if(hs.size() == 1){
            return "Flush";
        }
        TreeMap<Integer , Integer> hm = new TreeMap<>(Collections.reverseOrder());
        for(int e : ranks){
            hm.put(e , hm.getOrDefault(e , 0) + 1);
        }
        // for(Map.Entry<Integer , Integer> map : hm.entrySet()){
        //     System.out.println(map.getKey() + " " + map.getValue());
        // }
        int max = Integer.MIN_VALUE;
        for(Integer e : hm.values()){
            max = Math.max(max , e);
        }
        if(max >= 3){
            return "Three of a Kind";
        }else if(max >= 2){
            return "Pair";
        }
        return "High Card";
    }
}