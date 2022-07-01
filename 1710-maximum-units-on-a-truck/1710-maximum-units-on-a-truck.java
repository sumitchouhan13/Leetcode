class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,new Comparator<int[]>(){
        public int compare(int a[],int b[]){
            return b[1]-a[1];  
        }
        });
        int total_units = 0;
        for(int[] ar : boxTypes){
            int boxes = Math.min(truckSize , ar[0]);
            total_units += boxes * ar[1];
            truckSize -= boxes;
        }
        return total_units;
    }
}