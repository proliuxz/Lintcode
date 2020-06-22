package S601TO800;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class S624 {
    public int minLength(String s, Set<String> dict) {
        Queue<String> q = new LinkedList<>();
        Set<String> hash = new HashSet<>();

        int res = s.length();
        q.offer(s);
        hash.add(s);

        while (!q.isEmpty()) {
            s = q.poll();
            for (String sub : dict) {
                int found = s.indexOf(sub);
                while (found != -1) {
                    String ss = s.substring(0, found) + s.substring(found + sub.length());
                    if (!hash.contains(ss)) {
                        if (ss.length() < res)
                            res = ss.length();
                        q.offer(ss);
                        hash.add(ss);
                    }
                    found = s.indexOf(sub, found + 1);
                }
            }
        }
        return res;
    }
}
