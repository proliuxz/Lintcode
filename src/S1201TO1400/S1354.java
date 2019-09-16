package S1201TO1400;

import java.util.ArrayList;
import java.util.List;

public class S1354 {
    public List<Integer> getRow(int rowIndex) {
        // write your code here
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 0; i < rowIndex; i++) {
            list = nextLevel(list);
        }
        return list;
    }

    private List<Integer> nextLevel(List<Integer> cur)
    {
        List<Integer> next = new ArrayList<>();
        next.add(1);
        int pre = 0;
        for (int i = 0; i < cur.size() - 1; i++) {
            int num = cur.get(i);
            next.add(pre + num);
            pre = num;
        }
        next.add(1);
        return next;
    }
}
