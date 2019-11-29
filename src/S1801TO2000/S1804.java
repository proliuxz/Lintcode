package S1801TO2000;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class S1804 {
    public int FindTheRank(int[][] scores, int K) {
        // write your code here
        Set<int[]> set = new TreeSet<>(Comparator.comparing((int[] o) -> -o[0]));
        for (int i = 0; i < scores.length; i++) {
            int[] s = scores[i];
            int sum = 0;
            for (int sc: s)
                sum += sc;
            set.add(new int[] {sum, i});
        }
        return new ArrayList<>(set).get(K-1)[1];
    }

    public static void main(String[] args)
    {
        S1804 s = new S1804();
        int[][] scores = {{90,80,70},{90,90,90},{60,60,60}};
        var res = s.FindTheRank(scores, 2);
        System.out.println(res);
    }
}
