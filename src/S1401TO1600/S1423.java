package S1401TO1600;

import java.util.PriorityQueue;
import java.util.Queue;

public class S1423 {
    public boolean isNStraightHand(int[] hand, int W) {
        if (hand == null || hand.length == 0 || hand.length % W != 0)
            return false;

        Queue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < hand.length; i++)
            pq.offer(hand[i]);

        while (!pq.isEmpty()) {
            int start = pq.poll();
            for (int i = 1; i < W; i++)
                if (pq.remove(start + i))
                    continue;
                else
                    return false;
        }
        return true;
    }
}
