package S401TO600;

import java.util.Arrays;
import java.util.BitSet;
import java.util.stream.IntStream;

public class S556 {
    private static final int DEFAULT_SIZE = 2 << 24;
    private BitSet bits = new BitSet(DEFAULT_SIZE);
    private SimpleHash[] func;

    public S556(int k) {
        func = new SimpleHash[k];
        IntStream.range(0, k).forEach(i -> func[i] = new SimpleHash(DEFAULT_SIZE, 2 * i + 3));
    }

    public void add(String value) {
        Arrays.stream(func).forEach(f -> bits.set(f.hash(value), true));
    }

    public boolean contains(String value) {
        if (value == null)
            return false;
        boolean ret = true;
        for (SimpleHash f : func)
            ret = ret && bits.get(f.hash(value));
        return ret;
    }

    public static class SimpleHash {

        private int cap;
        private int seed;

        public SimpleHash(int cap, int seed) {
            this.cap = cap;
            this.seed = seed;
        }

        public int hash(String value) {
            int result = 0;
            int len = value.length();
            for (int i = 0; i < len; i++) {
                result = seed * result + value.charAt(i);
            }
            return (cap - 1) & result;
        }
    }
}
