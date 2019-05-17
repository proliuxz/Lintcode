package S401TO600;

import java.util.LinkedList;
import java.util.Queue;

public class S494 {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        // write your code here
        if (this.isEmpty())
            q1.offer(x);
        else
        {
            if (q1.size() > 0)
            {
                q2.offer(x);
                int size = q1.size();
                while (size > 0)
                {
                    q2.offer(q1.poll());
                    size--;
                }
            } else if (q2.size() > 0)
            {
                q1.offer(x);
                int size = q2.size();
                while (size > 0)
                {
                    q1.offer(q2.poll());
                    size--;
                }
            }
        }
    }

    public void pop() {
        // write your code here
        if (q1.size() > 0)
        {
            q1.poll();
        } else if
        (q2.size() > 0)
        {
            q2.poll();
        }
    }

    public int top() {
        if (q1.size() > 0)
        {
            return q1.peek();
        }
        else if (q2.size() > 0)
        {
            return q2.peek();
        }
        return 0;
    }

    public boolean isEmpty() {
        return q1.isEmpty() && q2.isEmpty();
    }

}
