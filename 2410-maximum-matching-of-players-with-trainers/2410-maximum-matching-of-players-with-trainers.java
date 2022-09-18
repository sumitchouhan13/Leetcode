class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int playersLength = players.length , trainersLength = trainers.length;
        int i = 0 , j = 0;
        int count = 0;
        while(i < playersLength && j < trainersLength){
            if(players[i] <= trainers[j]){
                count++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return count;
    }
}