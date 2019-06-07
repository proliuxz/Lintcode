package S1601TO1800;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S1794 {
    public List<Integer> CountDuplicates(List<Integer> nums) {
        // write your code here
        Set<Integer> set = new HashSet<>();
        Set<Integer> visited = new HashSet<>();
        List<Integer> res = new ArrayList();
        for (int num: nums
             ) {
            if (!set.contains(num))
                set.add(num);
            else if (!visited.contains(num))
            {
                res.add(num);
                visited.add(num);
            }
        }
        List<Integer> result = new ArrayList(res);
        return result;
    }
}
