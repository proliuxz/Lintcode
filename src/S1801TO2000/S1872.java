package S1801TO2000;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class S1872 {
    public int MinimumCost(List<Integer> sticks) {
        int res = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        for (int stick : sticks)
            queue.offer(stick);
        while (queue.size() > 1) {
            int i1 = queue.poll();
            int i2 = queue.poll();
            int val = i1 + i2;
            queue.offer(val);
            res += val;
        }
        return res;
    }
}
