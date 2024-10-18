import java.util.Stack;

class MyQueue {
    private Stack<Integer> st1 = new Stack<>();
    private Stack<Integer> st2 = new Stack<>();
    private int front;

    public MyQueue() {

    }

    public void push(int x) {
        if (st1.isEmpty() && st2.isEmpty())
            front = x;
        st1.push(x);
    }

    public int pop() {
        reverse(st1, st2);
        int val = st2.pop();
        reverse(st2, st1);
        return val;
    }

    public int peek() {
        reverse(st1, st2);
        int val = st2.pop();
        st1.push(val);
        reverse(st2, st1);
        return val;
    }

    public boolean empty() {
        if (st1.isEmpty() && st2.isEmpty()) {
            return true;
        }
        return false;
    }

    public void reverse(Stack st1, Stack st2) {
        while (!st1.empty()) {
            st2.push(st1.pop());
        }
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