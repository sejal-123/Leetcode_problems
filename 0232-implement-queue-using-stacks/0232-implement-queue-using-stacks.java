class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    
    public void push(int x) {
        if (!s1.isEmpty()) {
            s1.push(x);
        } else {
            s2.push(x);
        }
    }
    
    public int pop() {
        if (empty())
            return -1;
        int front = -1;
        if (!s1.isEmpty()) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            front = s2.pop();
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        } else {
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            front = s1.pop();
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return front;
    }
    
    public int peek() {
        if (empty())
            return -1;
        int front = -1;
        if (!s1.isEmpty()) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            front = s2.peek();
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        } else {
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            front = s1.peek();
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return front;
    }
    
    public boolean empty() {
        return (s1.isEmpty() && s2.isEmpty());
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