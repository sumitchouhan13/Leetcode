class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 1 ; i <= 9 ; i++){
            dfs(i , i , n - 1 , k , res);
        }
        int[] ar = new int[res.size()];
        for(int i = 0 ; i < res.size() ; i++){
            ar[i] = res.get(i);
        }
        return ar;
    }
    public void dfs(int num , int digit , int n , int k , ArrayList<Integer> res){
        if(n == 0){
            res.add(num);
            return;
        }
        if(digit + k <= 9){
            dfs(num * 10 + (digit + k) , digit + k , n - 1 , k , res);
        }
        if(k != 0 && (digit - k) >= 0){
            dfs(num * 10 + (digit - k) , digit - k , n - 1 , k , res);
        }
    }
}