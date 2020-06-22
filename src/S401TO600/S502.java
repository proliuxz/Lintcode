package S401TO600;

import Util.Column;

import java.util.*;

public class S502 {
    private Map<String, TreeMap<Integer, String>> map;
    public S502() {
        map = new HashMap<>();
    }
    public void insert(String row_key, int column_key, String value) {
        TreeMap<Integer, String> subMap = map.getOrDefault(row_key, new TreeMap<>());
        subMap.put(column_key, value);
        map.put(row_key, subMap);
    }

    public List<Column> query(String row_key, int column_start, int column_end) {
        List<Column> res = new ArrayList<>();
        if (!map.containsKey(row_key))
            return res;
        for (Map.Entry<Integer, String> entry : map.get(row_key).subMap(column_start, true, column_end, true).entrySet())
            res.add(new Column(entry.getKey(), entry.getValue()));
        return res;
    }
}
