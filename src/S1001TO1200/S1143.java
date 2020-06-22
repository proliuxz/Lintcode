package S1001TO1200;

import java.util.*;

public class S1143 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++)
            map.put(list1[i], i);
        List<String> res = new ArrayList<>();
        int min_sum = list1.length + list2.length;
        int sumIdx;
        for (int j = 0; j < list2.length && j <= min_sum; j++) {
            if (map.containsKey(list2[j])) {
                sumIdx = j + map.get(list2[j]);
                if (sumIdx < min_sum) {
                    res.clear();
                    res.add(list2[j]);
                    min_sum = sumIdx;
                } else if (sumIdx == min_sum)
                    res.add(list2[j]);
            }
        }
        return res.toArray(new String[0]);
    }
}
