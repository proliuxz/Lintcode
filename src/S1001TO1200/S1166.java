package S1001TO1200;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class S1166 {
    public List<String> scatter(List<String> elements, int n) {
        Queue<String> v = new LinkedList<>();
        Queue<String> p = new LinkedList<>();
        int firstP = 0;
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).charAt(0) == 'P') {
                if (p.isEmpty())
                    firstP = i;
                p.offer(elements.get(i));
            } else
                v.offer(elements.get(i));
        }

        List<String> res = new ArrayList<>();
        while (firstP > 0) {
            firstP--;
            res.add(v.poll());
        }

        int step = 0;
        while (!p.isEmpty()) {
            res.add(p.poll());
            step = n;
            while (!v.isEmpty() && step > 1) {
                res.add(v.poll());
                step--;
            }
            if (step > 1)
                break;
        }
        return res;
    }
}
