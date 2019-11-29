package S601TO800;

import java.util.LinkedList;
import java.util.Queue;

public class S642 {

    private Queue<Integer> que;
    private double sum = 0;
    private int size;

    /** Initialize your data structure here. */
    public S642(int size) {
        que = new LinkedList<>();
        this.size = size;
    }

    public double next(int val) {
        // Write your code here

        if (que.size() == size)
            sum = sum - que.poll();
        sum += val;
        que.offer(val);
        return sum / que.size();
    }
}
