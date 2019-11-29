package S201TO400;

import java.util.Map;
import java.util.TreeMap;

public class S1705 {
    public int[] compareStringii(String A, String B) {
        // write your code here
        String[] sources = A.split(",");
        String[] targets = B.split(",");
        int[] res = new int[targets.length];
        for (int i = 0; i < res.length; i++) {
            String target = targets[i];
            String cTarget = toCompareString(target);
            for (String source: sources
                 ) {
                String cSource = toCompareString(source);
                if (cSource.compareTo(cTarget) <= 0)
                    res[i]++;
            }
        }
        return res;
    }

    private String toCompareString(String s)
    {
        Map<Character, Integer> map = new TreeMap<>();
        for (char c: s.toCharArray()
             ) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (char key: map.keySet()
             ) {
            sb.append(key);
            sb.append(map.get(key));
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        String A = "abcd,aabc,bd";
        String B = "aaa,aa";
        S1705 s = new S1705();
        int[] res = s.compareStringii(A, B);
        for (int r: res
             ) {
            System.out.println(r);
        }
    }
}
