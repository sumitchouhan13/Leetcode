class Solution {
    public int maximumGroups(int[] grades) {
        // size of the groups
        // 1 + 2 + .. ........ + k <= n
        // k * (k + 1) / 2 <= n
        // (k + 0.5)(k + 0.5) <= 2 * n + 0.25
        // k <= sqrt(2 * n + 0.25) - 0.5
        int n = grades.length;
        return (int)(Math.sqrt(2 * n + 0.25) - 0.5);
    }
}