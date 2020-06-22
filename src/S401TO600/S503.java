package S401TO600;

import java.util.*;

public class S503 {
    public static class Map {
        public void map(String key, String value,
                        OutputCollector<String, String> output) {
            StringTokenizer tokenizer = new StringTokenizer(value);
            while (tokenizer.hasMoreTokens())
            {
                String s = tokenizer.nextToken();
                char[] chs = s.toCharArray();
                Arrays.sort(chs);
                output.collect(new String(chs), s);
            }
        }
    }

    public static class Reduce {
        public void reduce(String key, Iterator<String> values,
                           OutputCollector<String, List<String>> output) {
            List<String> res = new ArrayList<>();
            while (values.hasNext())
                res.add(values.next());
            output.collect(key, res);
        }
    }
}
