package S401TO600;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class S541 {
    Queue<Iterator<Integer>> queue;
    public S541(List<List<Integer>> vecs) {
        queue = new LinkedList<>();
        vecs.stream()
                .filter(l -> !l.isEmpty())
                .forEach(l -> queue.add(l.iterator()));
    }

    /*
     * @return: An integer
     */
    public int next() {
        // write your code here
        Iterator<Integer> iterator = queue.poll();
        int res = iterator.next();
        if (iterator.hasNext())
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
