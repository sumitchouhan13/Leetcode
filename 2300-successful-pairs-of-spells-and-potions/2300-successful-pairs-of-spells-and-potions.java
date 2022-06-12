class Solution {
    public int binarySearch(int[] potions , int spell , long success){
        int l = 0 , r = potions.length - 1;
        int ans = -1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(spell * 1l * potions[mid] < success){
                l = mid + 1;
            }else{
                ans = mid;
                r = mid - 1;
            }
        }
        return ans;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = potions.length;
        int[] res = new int[spells.length];
        Arrays.sort(potions);
        for(int i = 0 ; i < spells.length ; i++){
            int index = binarySearch(potions , spells[i] , success);
            if(index >= 0){
                res[i] = n - index;
            }
        }
        return res;
    }
}