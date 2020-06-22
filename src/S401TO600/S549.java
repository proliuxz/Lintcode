package S401TO600;

import Util.Document;

import java.util.*;

class Pair {
    String key;
    int value;

    Pair(String key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class S549 {

    public static class Map {
        public void map(String s, Document value,
                        OutputCollector<String, Integer> output) {
            StringTokenizer tokenizer = new StringTokenizer(value.content);
            while (tokenizer.hasMoreTokens())
                output.collect(tokenizer.nextToken(),1);

        }
    }

    public static class Reduce {
        private PriorityQueue<Pair> Q = null;
        private int k;

        private Comparator<Pair> pairComparator = (left, right) -> left.value == right.value ?  right.key.compareTo(left.key) : left.value - right.value;

        public void setup(int k) {
            this.k = k;
            Q = new PriorityQueue<>(k, pairComparator);
        }

        public void reduce(String key, Iterator<Integer> values) {
            int sum = 0;
            while (values.hasNext())
                sum += values.next();

            Pair pair = new Pair(key, sum);
            if (Q.size() < k)
                Q.add(pair);
            else {
                Pair peak = Q.peek();
                if (pairComparator.compare(pair, peak) > 0) {
                    Q.poll();
                    Q.add(pair);
                }
            }
        }

        public void cleanup(OutputCollector<String, Integer> output) {
            List<Pair> pairs = new ArrayList<Pair>();
            while (!Q.isEmpty())
                pairs.add(Q.poll());

            int n = pairs.size();
            for (int i = n - 1; i >= 0; --i) {
                Pair pair = pairs.get(i);
                output.collect(pair.key, pair.value);
            }
        }
    }
}