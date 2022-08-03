class MyCalendar {
    TreeMap<Integer , Integer> hm;
    public MyCalendar() {
        hm = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Integer prev = hm.floorKey(start), next = hm.ceilingKey(start);
        if((prev == null || hm.get(prev) <= start) && (next == null || end <= next)){
            hm.put(start , end);
            return true;
        }
        return false;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */