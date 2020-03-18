package S601TO800;

import java.util.Arrays;
import java.util.PriorityQueue;

public class S606 {
    public int kthLargestElement2(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        Arrays.stream(nums).forEach(num -> {
            queue.offer(num);
            if (queue.size() > k)
                queue.poll();
        });
        return queue.peek();
    }
}
