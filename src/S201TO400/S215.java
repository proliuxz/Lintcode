package S201TO400;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S215 {
    private Map<String, List<Integer>> map;
    private Map<String, Integer> durationMap;
    public S215()
    {
        map = new HashMap<>();
        durationMap = new HashMap<>();
        durationMap.put("s", 1);
        durationMap.put("m", 60);
        durationMap.put("h", 3600);
        durationMap.put("d", 86400);
    }
    public boolean isRatelimited(int timestamp, String event, String rate, boolean increment) {
        int index = rate.indexOf("/");
        int limit = Integer.parseInt(rate.substring(0, index));
        int duration = durationMap.get(rate.substring(index + 1));
        int start = timestamp - duration + 1;
        if (!map.containsKey(event)) {
            map.put(event, new ArrayList<>());
        }
        int count = getCount(map.get(event), start);
        if (increment && count < limit) {
            map.get(event).add(timestamp);
        }
        return count >= limit;
    }

    private int getCount(List<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (list.get(mid) >= target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return list.size() - left;
    }
}
