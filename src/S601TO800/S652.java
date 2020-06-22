package S601TO800;

import java.util.ArrayList;
import java.util.List;

public class S652 {
    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> res =  new ArrayList<>();
        if (n <= 1)
            return res;
        getFactors(res, new ArrayList<>(), n, 2);
        return res;
    }

    private void getFactors(List<List<Integer>> res, List<Integer> list, int n, int pos) {
        for (int i = pos; i <= Math.sqrt(n); i++) {
            if (n % i == 0 && n / i >= i) {
                list.add(i);
                list.add(n / i);
                res.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
                getFactors(res, list, n / i, i);
                list.remove(list.size() - 1);
            }
        }
    }
}
