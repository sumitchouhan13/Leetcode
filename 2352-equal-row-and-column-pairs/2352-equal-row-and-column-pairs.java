class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;
        ArrayList<String> column = new ArrayList<>();
        ArrayList<String> row = new ArrayList<>();
        for(int i = 0 ; i < grid[0].length ; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j < grid.length ; j++){
                sb.append(grid[j][i] + ",");
            }
            column.add(sb.toString());
        }
        for(int i = 0 ; i < grid[0].length ; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j < grid.length ; j++){
                sb.append(grid[i][j] + ",");
            }
            row.add(sb.toString());
        }
        for(String s : row){
            for(String st : column){
                if(s.equals(st)){
                    count++;
                }
            }
        }
        return count;
    }
}