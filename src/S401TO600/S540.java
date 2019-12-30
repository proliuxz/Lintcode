package S401TO600;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class S540 {
    Queue<Iterator<Integer>> queue;
    public S540(List<Integer> v1, List<Integer> v2) {
        queue = new LinkedList<>();
        if (!v1.isEmpty())
            queue.add(v1.iterator());
        if (!v2.isEmpty())
            queue.add(v2.iterator());
    }

    public int next() {
        // write your code here
        Iterator<Integer> iterator = queue.remove();
        int res = iterator.next();
        if(iterator.hasNext())
            queue.add(iterator);
        return res;
    }

    /*
     * @return: True if has next
     */
    public boolean hasNext() {
        // write your code here
        return !queue.isEmpty();
    }
}
