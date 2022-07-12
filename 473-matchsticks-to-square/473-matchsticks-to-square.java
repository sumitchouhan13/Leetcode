class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        for(int e : matchsticks){
            sum += e;
        }
        if(sum % 4 != 0){
            return false;
        }
        Arrays.sort(matchsticks);
        return recursion(matchsticks , matchsticks.length - 1 , 0 , 0 , 0 , 0 , sum / 4);
    }
    public boolean recursion(int[] m , int index , int top , int bottom , int left , int right , int target){
        if(top == target && bottom == target && left == target && right == target && index == -1){
            return true;
        }
        if (top > target || bottom > target || left > target || right > target || m.length == -1){
            return false;
        }
        int val = m[index];
        boolean t = recursion(m, index - 1, top + val, bottom, left, right, target);
        if (t) return true;
        boolean b = recursion(m, index - 1, top, bottom + val, left, right, target);
        if (b) return true;
        boolean l = recursion(m, index - 1, top, bottom, left + val, right, target);
        if (l) return true;
        boolean r = recursion(m, index - 1, top, bottom, left, right + val, target);
        if (r) return true;
        
        return false;
    }
}