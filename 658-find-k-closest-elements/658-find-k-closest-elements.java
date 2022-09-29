class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        Queue<int[]> q = new PriorityQueue<>((a,b) -> b[1]!=a[1] ? b[1] - a[1] : a[0] - b[0]);
        for(int i = 0 ; i < arr.length ; i++){
            if(q.size() == k){
                if(Math.abs(arr[i] - x) < q.peek()[1]){
                    q.poll();
                    q.add(new int[]{i , Math.abs(x - arr[i])});
                }
            }else{
                q.add(new int[]{i , Math.abs(x - arr[i])});
            }
        }
        int size = q.size();
        for(int i=0 ; i < size ; i++){
            res.add(arr[q.poll()[0]]);
        }
        Collections.sort(res);
        return res;
    }
}