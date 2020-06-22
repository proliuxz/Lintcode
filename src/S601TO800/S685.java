package S601TO800;

import java.util.LinkedHashMap;
import java.util.Map;

public class S685 {
    public int firstUniqueNumber(int[] nums, int number) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        boolean isEnd = false;
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            if(n == number)
            {
                isEnd = true;
                break;
            }
        }

        if(!isEnd)
            return -1;

        for(int n : map.keySet())
            if(map.get(n) == 1)
                return n;

        return -1;
    }
}
