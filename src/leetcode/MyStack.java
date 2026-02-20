package leetcode;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    private Queue<Integer> q1;

    public MyStack() {
        q1 = new LinkedList<>();
    }

    public void push(int x) {
        q1.offer(x);
        int size = q1.size();

        for (int i = 1; i < size; i++) {
            int y = q1.poll();
            q1.offer(y);
        }

    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}