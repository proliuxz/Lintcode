package S401TO600;

import java.util.ArrayList;
import java.util.List;

public class S441 {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < Math.pow(2,n); ++i) {
            res.add((i >> 1) ^ i);
        }
        return res;
    }
}
