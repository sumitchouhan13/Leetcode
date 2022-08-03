class MedianFinder {
    PriorityQueue<Integer> max;
    PriorityQueue<Integer> min;

    public MedianFinder() {
        max = new PriorityQueue<>(Collections.reverseOrder());
        min = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(max.isEmpty() || max.peek() >= num){
            max.offer(num);
        }else{
            min.offer(num);
        }
        if(max.size() > min.size() + 1){
            min.offer(max.poll());
        }else if(min.size() > max.size() + 1){
            max.offer(min.poll());
        }
    }
    
    public double findMedian() {
        if(max.size() == min.size()){
            int a = max.peek() , b = min.peek();
            return (a + b) / 2.0;
        }else{
            if(max.size() > min.size()){
                return max.peek() * 1.0;
            }else{
                return min.peek() * 1.0;
            }
        }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */