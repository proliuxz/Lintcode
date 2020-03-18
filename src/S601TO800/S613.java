package S601TO800;

import Util.Record;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class S613 {
    public Map<Integer, Double> highFive(Record[] results) {
        Map<Integer, Double> res = new HashMap<>();
        Map<Integer, PriorityQueue<Integer>> hash = new HashMap<>();

        for (Record r : results) {
            if (!hash.containsKey(r.id))
                hash.put(r.id, new PriorityQueue<Integer>());

            PriorityQueue<Integer> pq = hash.get(r.id);
            if (pq.size() < 5) {
                pq.add(r.score);
            } else if (pq.peek() < r.score) {
                pq.poll();
                pq.add(r.score);
            }
        }

        for (int key : hash.keySet()) {
            PriorityQueue<Integer> scores = hash.get(key);
            double average = 0;
            for (int i = 0; i < 5; ++i)
                average += scores.poll();
            average /= 5;
            res.put(key, average);
        }
        return res;
    }
}
