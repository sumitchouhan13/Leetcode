class Solution {
    public int minNumberOfHours(int ie, int ix, int[] energy, int[] experience) {
        int hours = 0;
        int n = energy.length;
        for(int i = 0 ; i < n ; i++){
            if(energy[i] >= ie){
                hours += Math.abs(energy[i] - ie) + 1;
                ie += Math.abs(energy[i] - ie) + 1;
            }
            if(experience[i] >= ix){
                hours += Math.abs(experience[i] - ix) + 1;
                ix += Math.abs(experience[i] - ix) + 1;
            }
            ie -= energy[i];
            ix += experience[i];
        }
        return hours;
    }
}