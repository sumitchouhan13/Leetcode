class Solution {
    public int[] findOriginalArray(int[] changed) {
        Arrays.sort(changed);
        int n = changed.length;
        if(n % 2 != 0)return new int[0];
        int j = n - 1;
        int[] res = new int[n/2];
        int idx = 0;
        HashMap<Integer , Integer> hm = new HashMap<>();
        while(j >= 0){
            int element = changed[j];
            int twice = element * 2;
            if(hm.containsKey(twice)){
                if(hm.get(twice) == 1){
                    hm.remove(twice);
                }else{
                    hm.put(twice , hm.get(twice) - 1);
                }
                res[idx++] = element;
            }else{
                hm.put(element , hm.getOrDefault(element,0) + 1);
            }
            j--;
        }
        return idx == n/2 ? res : new int[0];
    }
}