package S001TO200;

import java.util.ArrayList;
import java.util.List;

public class S152 {
    public List<List<Integer>> combine(int n, int k) {
        // write your code here
        List<List<Integer>> res = new ArrayList<>();
        if(n < k){
            return res;
        }

        backtrack(res, new ArrayList<>(), n, k, 1);
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> temp, int n, int k , int start){
        if(k == 0)
        {
            res.add(new ArrayList<>(temp));
            return;
        }


        for(int i = start; i <= n - k + 1; i++)
        {
            temp.add(i);
            backtrack(res, temp, n, k-1, i+1);
            temp.remove(temp.size() - 1);
        }
    }
}
