package S1201TO1400;

import java.util.*;

public class S1281 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((e1,e2) -> e1.getValue() - e2.getValue());
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (queue.size() < k)
                queue.offer(entry);
            else if (queue.peek().getValue() < entry.getValue()) {
                queue.poll();
                queue.offer(entry);
            }
        }

        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : queue)
            res.add(entry.getKey());
        return res;
    }
}
