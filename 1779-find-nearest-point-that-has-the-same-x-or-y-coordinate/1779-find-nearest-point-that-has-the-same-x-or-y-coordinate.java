class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1; 
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            // valid point
            int[] point = points[i];
            if (point[0] == x || point[1] == y) {
                int currDist = Math.abs(point[0] - x) + Math.abs(point[1] - y); 
                if (currDist < distance) {
                    distance = currDist; 
                    index = i;
                }
            }
        }
        return index;
    }
}