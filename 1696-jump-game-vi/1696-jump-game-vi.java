class Solution {
    public int maxResult(int[] nums, int k) {
        int[] ar = new int[nums.length];
        ar[0] = nums[0];
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(0);
        for(int i = 1 ; i < nums.length ; i++){
            if(q.getFirst() < i - k){
                q.removeFirst();
            }
            ar[i] = ar[q.getFirst()] + nums[i];
            while (!q.isEmpty() && ar[q.getLast()] <= ar[i]) {
                q.removeLast();
            }
            q.addLast(i);
        }
        return ar[nums.length - 1];
    }
}