package S401TO600;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class S544 {
    public int[] topk(int[] nums, int k) {
        // write your code here
        PriorityQueue<Integer> minheap = new PriorityQueue<>(k, Comparator.comparingInt(o -> o));

        Arrays.stream(nums).forEach(i -> {
            minheap.add(i);
            if (minheap.size() > k) {
                minheap.poll();
            }
        });

        int[] res = new int[k];
        IntStream.range(0, res.length).forEach(i -> res[k - i - 1] = minheap.poll());
        return res;
    }
}
