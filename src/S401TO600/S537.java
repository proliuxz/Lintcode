package S401TO600;

import java.util.Iterator;
import java.util.stream.IntStream;

class OutputCollector<K, V> {
     public void collect(K key, V value) { }
}

public class S537 {
    public static class Map {
        public void map(String s, int n, String str,
                        OutputCollector<String, Integer> output) {
            // Write your code here
            // Output the results into output buffer.
            // Ps. output.collect(String key, Integer value);
            IntStream.range(0, str.length() - n + 1).forEach(i -> output.collect(str.substring(i, i + n), 1));
        }
    }

    public static class Reduce {
        public void reduce(String key, Iterator<Integer> values,
                           OutputCollector<String, Integer> output) {
            // Write your code here
            // Output the results into output buffer.
            // Ps. output.collect(String key, int value);
            int sum = 0;
            while (values.hasNext())
                sum += values.next();
            output.collect(key, sum);
        }
    }
}
