package S401TO600;

import java.util.*;

public class S526 {
    private Map<Integer, Integer> map;
    private List<Integer> list;
    private Random random;
    public S526() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    public void add(int server_id) {
        int idx = list.size();
        list.add(server_id);
        map.put(server_id, idx);
    }

    public void remove(int server_id) {
        int idx = map.get(server_id);
        map.remove(server_id);
        if (idx == list.size()) {
            list.remove(list.size() - 1);
            return;
        }
        int lastItemIdx = list.size() - 1;
        int lastItem = list.get(lastItemIdx);
        list.set(idx, lastItem);
        list.remove(lastItemIdx);
        map.put(lastItem, idx);
    }

    public int pick() {
        return list.get(random.nextInt(list.size()));
    }
}
