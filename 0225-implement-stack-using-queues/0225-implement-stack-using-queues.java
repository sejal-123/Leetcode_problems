class MyStack {
    
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    
    public void push(int x) {
        if (!q1.isEmpty()) {
            q1.push(x);
        } else {
            q2.push(x);
        }
    }
    
    public int pop() {
        int front = -1;
        if (!q1.isEmpty()) {
            while (!q1.isEmpty()) {
                front = q1.pop();
                if (!q1.isEmpty()) {
                    q2.push(front);
                } else {
                    front = q1.pop();
                }
            }
        } else {
             while (!q2.isEmpty()) {
                front = q2.pop();
                if (!q2.isEmpty()) {
                    q1.push(front);
                } else {
                    front = q2.pop();
                }
            }
        }
        return front;
    }
    
    public int top() {
        int front = -1;
        if (!q1.isEmpty()) {
            while (!q1.isEmpty()) {
                front = q1.pop();
                if (!q1.isEmpty()) {
                    q2.push(front);
                }
            }
        } else {
             while (!q2.isEmpty()) {
                front = q2.pop();
                if (!q2.isEmpty()) {
                    q1.push(front);
                }
            }
        }
        return front;
    }
    
    public boolean empty() {
        if (q1.isEmpty && q2.isEmpty()) {
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */