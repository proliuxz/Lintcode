package S1601TO1800;

import java.util.LinkedList;
import java.util.Queue;

public class S1709 {
    Queue<Integer> cache;
    public S1709() {
        cache = new LinkedList<>();
    }

    public int ping(int t) {
        cache.offer(t);
        while (!cache.isEmpty() && cache.peek() < t - 3000)
            cache.poll();
        return cache.size();
    }
}
