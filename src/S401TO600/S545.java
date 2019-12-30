package S401TO600;

import java.util.*;

public class S545 {
    Queue<Integer> queue;
    int k;
    public S545(int k) {
        queue = new PriorityQueue<>();
        this.k = k;
    }

    /*
     * @param num: Number to be added
     * @return: nothing
     */
    public void add(int num) {
        if (queue.size() < k)
            queue.offer(num);
        else if (num > queue.peek())
        {
            queue.poll();
            queue.offer(num);
        }
    }

    /*
     * @return: Top k element
     */
    public List<Integer> topk() {
        List<Integer> res = new ArrayList<>(queue);
        Collections.sort(res, Collections.reverseOrder());
        return res;
    }
}
