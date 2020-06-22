package S401TO600;

import Util.Document;

import java.util.*;

public class S504 {
    public void map(String s, Document value,
                    OutputCollector<String, Integer> output) {
        StringTokenizer tokenizer = new StringTokenizer(value.content);
        while (tokenizer.hasMoreTokens())
        {
            output.collect(tokenizer.nextToken(),value.id);
        }
    }

    public static class Reduce {
        public void reduce(String key, Iterator<Integer> values,
                           OutputCollector<String, List<Integer>> output) {
            Set<Integer> res = new HashSet<>();
            while (values.hasNext())
            {
                res.add(values.next());
            }
            output.collect(key, new ArrayList<>(res));
        }
    }
}
