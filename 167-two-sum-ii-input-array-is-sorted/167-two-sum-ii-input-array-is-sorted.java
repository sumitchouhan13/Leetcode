class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < numbers.length ; i++){
            int num = target - numbers[i];
            if(!hm.containsKey(num)){
                hm.put(numbers[i] , i + 1);
            }else{
                res[0] = hm.get(num);
                res[1] = i + 1;
                break;
            }
        }
        return res;
    }
}