package S401TO600;

import java.util.HashMap;
import java.util.Map;

class Mem{
    public int val;
    public int ttl;
    public Mem(int v,int t)
    {
        val = v;
        ttl = t;
    }
}

public class S538 {
    Map<Integer, Mem> map;
    public S538() {
        // do intialization if necessary
        map = new HashMap<>();
    }
    public int get(int curtTime, int key) {
        // write your code here
        if (!map.containsKey(key))
            return 2147483647;
        Mem m = map.get(key);
        if (m.ttl >= curtTime || m.ttl == -1)
            return m.val;
        else{
            map.remove(key);
            return 2147483647;
        }
    }

    /*
     * @param curtTime: An integer
     * @param key: An integer
     * @param value: An integer
     * @param ttl: An integer
     * @return: nothing
     */
    public void set(int curtTime, int key, int value, int ttl) {
        // write your code here
        map.put(key, new Mem(value, ttl == 0 ? -1 : curtTime + ttl - 1));
    }

    /*
     * @param curtTime: An integer
     * @param key: An integer
     * @return: nothing
     */
    public void delete(int curtTime, int key) {
        // write your code here
        map.remove(key);
    }

    /*
     * @param curtTime: An integer
     * @param key: An integer
     * @param delta: An integer
     * @return: An integer
     */
    public int incr(int curtTime, int key, int delta) {
        // write your code here
        if (get(curtTime, key) == Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        map.get(key).val += delta;
        return map.get(key).val;
    }

    /*
     * @param curtTime: An integer
     * @param key: An integer
     * @param delta: An integer
     * @return: An integer
     */
    public int decr(int curtTime, int key, int delta) {
        // write your code here
        if (get(curtTime, key) == Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        map.get(key).val -= delta;
        return map.get(key).val;
    }
}
