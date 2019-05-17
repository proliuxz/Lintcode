package S401TO600;

import java.util.Deque;
import java.util.LinkedList;

public class S493 {
    Deque<Integer> deque;
    public S493() {
        deque = new LinkedList<>();
    }
    public void push_front(int item) {
        deque.addFirst(item);
    }

    public void push_back(int item) {
        deque.addLast(item);
    }

    public int pop_front() {
        return deque.pollFirst();
    }

    public int pop_back() {
        return deque.pollLast();
    }
}
