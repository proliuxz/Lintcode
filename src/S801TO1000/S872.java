package S801TO1000;

import java.util.*;

public class S872 {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < ppid.size(); i++) {
            List<Integer> list = map.getOrDefault(ppid.get(i), new ArrayList<>());
            list.add(pid.get(i));
            map.put(ppid.get(i), list);
        }
        List<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(kill);
        while (!queue.isEmpty())
        {
            int cur = queue.poll();
            res.add(cur);
            if (map.containsKey(cur))
                queue.addAll(map.get(cur));
        }
        return res;
    }
}
