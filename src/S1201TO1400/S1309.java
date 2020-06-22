package S1201TO1400;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class S1309 {
    Map<String, List<Integer>> cache = new HashMap<>();
    public List<Integer> diffWaysToCompute(String input) {
        if (cache.containsKey(input))
            return cache.get(input);
        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '-' || c == '*' || c == '+') {
                String part1 = input.substring(0, i);
                String part2 = input.substring(i + 1);
                List<Integer> r1 = diffWaysToCompute(part1);
                List<Integer> r2 = diffWaysToCompute(part2);
                for (Integer p1 : r1) {
                    for (Integer p2 : r2) {
                        int s = 0;
                        switch (c) {
                            case '+':
                                s = p1 + p2;
                                break;
                            case '-':
                                s = p1 - p2;
                                break;
                            case '*':
                                s = p1 * p2;
                                break;
                        }
                        res.add(s);
                    }
                }
            }
        }
        if (res.size() == 0)
            res.add(Integer.valueOf(input));
        cache.put(input, res);
        return res;
    }
}
