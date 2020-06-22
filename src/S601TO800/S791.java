package S601TO800;

import java.util.PriorityQueue;
import java.util.Queue;

public class S791 {
    public int mergeNumber(int[] numbers) {
        int res = 0;
        if (numbers == null || numbers.length < 2)
            return res;
        Queue<Integer> queue = new PriorityQueue();
        for (int num: numbers) {
            queue.add(num);
        }
        while (queue.size() > 1)
        {
            int cur = queue.poll() + queue.poll();
            res += cur;
            queue.offer(cur);
        }
        return res;
    }
}
