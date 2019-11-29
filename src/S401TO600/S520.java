package S401TO600;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;

public class S520 {
    TreeMap<Integer, Integer> map = new TreeMap<>();
    int[] nums;
    int machineNum = 0;
    int k;

    public static S520 create(int n, int k) {
        // Write your code here
        S520 s = new S520();
        s.nums = new int[n];
        for(int i = 0; i < n; i++)
            s.nums[i] = i;

        Random random = new Random();
        for(int i = 0; i < n; i++) {
            int j = random.nextInt(i + 1);
            int t = s.nums[i];
            s.nums[i] = s.nums[j];
            s.nums[j] = t;
        }
        s.k = k;
        return s;
    }

    public List<Integer> addMachine(int machine_id) {
        // write your code here
        List<Integer> ids = new ArrayList<>();
        for(int i = 0; i < this.k; i++) {
            int id = this.nums[machineNum++ % this.nums.length];
            ids.add(id);
            this.map.put(id, machine_id);
        }
        return ids;
    }

    public int getMachineIdByHashCode(int hashcode) {
        // write your code here
        if (map.isEmpty()) return 0;
        Integer ceiling = map.ceilingKey(hashcode);
        if (ceiling != null)
            return map.get(ceiling);
        return map.get(map.firstKey());
    }
}
