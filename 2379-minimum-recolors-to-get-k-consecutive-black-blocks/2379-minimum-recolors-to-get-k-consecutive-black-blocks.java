class Solution {
    public int minimumRecolors(String blocks, int k) {
        // int len = blocks.length();
        // ArrayList<Integer> ar = new ArrayList<>();
        // int i = 0 , j = 0;
        // int count = 0;
        // while(i < len && j < len){
        //     if(blocks.charAt(i) == 'W'){
        //         ar.add(0);
        //         i++;
        //         j++;
        //     }else if(blocks.charAt(i) == 'B' && blocks.charAt(j) == 'B'){
        //         count++;
        //         j++;
        //     }else{
        //         ar.add(count);
        //         count = 0;
        //         i = j;
        //     }
        // }
        // int max = 0;
        // for(Integer e : ar){
        //     max = Math.max(max , e);
        // }
        // if(k <= max){
        //     return 0;
        // }
        // int min = Integer.MAX_VALUE;
        // for(int x = 0 ; x < ar.size() - 1 ; x++){
        //     int res = 0 , c = 0;
        //     for(int l = x ; l < ar.size() ; l++){
        //         res += ar.get(l);
        //         if(ar.get(l) == 0){
        //             c++;
        //         }
        //         if(k <= res){
        //             break;
        //         }
        //     }
        //     min = Math.min(min , c);
        // }
        // return min;
        int len = blocks.length() , ans = 0;
        for(int i = 0 ; i < k ; i++){
            if(blocks.charAt(i) == 'W'){
                ans++;
            }
        }
        int min = ans;
        int l = 1 , r = k;
        while(r < len){
            if(blocks.charAt(l - 1) == 'W'){
                ans--;
            }
            if(blocks.charAt(r) == 'W'){
                ans++;
            }
            if(ans == 0){
                return 0;
            }
            min = Math.min(min , ans);
            l++;
            r++;
        }
        return min;
    }
}