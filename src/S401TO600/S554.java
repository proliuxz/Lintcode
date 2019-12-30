package S401TO600;

import java.util.*;
import java.util.stream.Collectors;

public class S554 {
    public static class Map {
        public void map(int s, List<Integer> value,
                        OutputCollector<String, List<Integer>> output) {
            Collections.sort(value);
            output.collect("", value);
        }
    }

    public static class Reduce {
        public void reduce(String key, List<List<Integer>> values,
                           OutputCollector<String, List<Integer>> output) {
            Queue<Integer> queue = values.stream().flatMapToInt(value -> value.stream().mapToInt(i -> i)).boxed().collect(Collectors.toCollection(PriorityQueue::new));
            List<Integer> res = new ArrayList<>();
            while(!queue.isEmpty())
                res.add(queue.poll());
            output.collect(key, res);
        }
    }
}
