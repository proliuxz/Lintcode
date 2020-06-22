package S601TO800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class S772 {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str: strs
             ) {
            String idx = helper(str);
            List<String> list = map.getOrDefault(idx, new ArrayList<>());
            list.add(str);
            map.put(idx, list);
        }
        return new ArrayList<>(map.values());
    }

    private String helper(String s)
    {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}
