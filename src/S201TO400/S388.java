package S201TO400;

import java.util.ArrayList;
import java.util.List;

public class S388 {
    public String getPermutation(int n, int k) {
        // write your code here
        List<Integer> num = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++)
            num.add(i);
        int[] fact = new int[n];  // factorial
        fact[0] = 1;
        for (int i = 1; i < n; i++)
            fact[i] = i*fact[i-1];
        k = k-1;
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--)
        {
            int ind = k/fact[i-1];
            k = k%fact[i-1];
            sb.append(num.get(ind));
            num.remove(ind);
        }
        return sb.toString();
    }
}
