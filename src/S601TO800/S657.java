package S601TO800;

import java.util.HashSet;
import java.util.Set;

public class S657 {
    Set<Integer> set;
    public S657() {
        set = new HashSet<>();
    }

    /*
     * @param val: a value to the set
     * @return: true if the set did not already contain the specified element or false
     */
    public boolean insert(int val) {
        return set.add(val);
    }

    /*
     * @param val: a value from the set
     * @return: true if the set contained the specified element or false
     */
    public boolean remove(int val) {
        return set.remove(val);
    }

    /*
     * @return: Get a random element from the set
     */
    public int getRandom() {
        Object[] obj =set.toArray();
        return (int) obj[(int)(Math.random()*obj.length)];
    }
}
