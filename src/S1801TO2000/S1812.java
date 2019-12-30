package S1801TO2000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S1812 {
    public List<Integer> RotationNumber(int n) {
        // write your code here
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            int r = getChangedNum(i);
            if (r != -1 && r <= n && i != r)
                res.add(i);
        }
        return res;
    }

    private int getChangedNum(int num)
    {
        Map<Character, Integer> map = new HashMap<>();
        map.put('0',0);
        map.put('6',9);
        map.put('9',6);
        map.put('8',8);
        int res = 0;
        for (Character c: Integer.toString(num).toCharArray()) {
            if (!map.containsKey(c))
                return -1;
            res = res * 10 + map.get(c);
        }
        return res;
    }

    public static void main(String[] args)
    {
        S1812 s = new S1812();
        System.out.println(s.RotationNumber(8000));
    }
}
