package S001TO200;

import java.util.*;

public class S171 {
    public List<String> anagrams(String[] strs) {
        // write your code here
        List<String> result = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return result;
        }
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String s = String.valueOf(arr);
            if (!map.containsKey(s)) {
                ArrayList<String> list = new ArrayList<>();
                map.put(s, list);
            }
            map.get(s).add(strs[i]);
        }
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            if (entry.getValue().size() >= 2) {
                result.addAll(entry.getValue());
            }
        }
        return result;
    }
}
