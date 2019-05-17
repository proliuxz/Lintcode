package S401TO600;

import java.util.LinkedList;
import java.util.Queue;

public class S492 {
    Queue<Integer> queue = new LinkedList<>();
    public void enqueue(int item) {
        // write your code here
        queue.add(item);
    }

    /*
     * @return: An integer
     */
    public int dequeue() {
        // write your code here
        return queue.poll();
    }
}
