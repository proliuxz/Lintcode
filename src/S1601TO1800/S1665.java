package S1601TO1800;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class S1665 {
    public int[] calculateNumber(int num) {
        // Write your code here.
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int i = 0;
        while (num > 0)
        {
            if (num % 2 == 1)
            {
                sum++;
                list.add(i);
            }
            num /= 2;
            i++;
        }
        list.add(0, sum);
        int[] res = list.stream().mapToInt(x->x).toArray();
        return res;
    }
}
