class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties , (a , b) -> (a[0] == b[0]) ? (b[1] - a[1]) : a[0] - b[0]);
        int greater = 0 , max = 0 , n = properties.length;
        for(int i = n - 1 ; i >= 0 ; i--){
            if(properties[i][1] < max){
                greater++;
            }
            max = Math.max(max , properties[i][1]);
        }
        return greater;
    }
}