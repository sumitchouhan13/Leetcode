class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer , Boolean> hm = new HashMap<>();
        for(int e : nums){
            hm.put(e , true);
        }
        for(int e : nums){
            if(hm.containsKey(e - 1)){
                hm.put(e , false);
            }
        }
        int max = 0 , maxLength = 0;
        for(int e : nums){
            if(hm.get(e)){
                int totalLength = 1;
                int totalStartingPoint = e;
                while(hm.containsKey(totalLength + totalStartingPoint)){
                    totalLength++;
                }
                if(totalLength > maxLength){
                    max = totalStartingPoint;
                    maxLength = totalLength;
                }
            }
        }
        return maxLength;
    }
}