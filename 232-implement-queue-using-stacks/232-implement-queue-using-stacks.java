class MyQueue {

    /** Initialize your data structure here. */
    Stack<Integer> queue1=new Stack();
Stack<Integer> queue2=new Stack();

public MyQueue() {
    
}

/** Push element x to the back of queue. */
public void push(int x) {
    while(!queue1.isEmpty()){
        queue2.push(queue1.pop());
    }
    queue1.push(x);
    while(!queue2.isEmpty()){
        queue1.push(queue2.pop());
    }
}

/** Removes the element from in front of queue and returns that element. */
public int pop() {
    return queue1.pop();
}

/** Get the front element. */
public int peek() {
    return queue1.peek();
}

/** Returns whether the queue is empty. */
public boolean empty() {
    return queue1.isEmpty();
}
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */