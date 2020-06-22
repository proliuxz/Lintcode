package S1801TO2000;

import java.util.HashSet;
import java.util.Set;

public class S1831 {
    public boolean ArraySummarization(int[] A, int[] B) {
        Set<Integer> set = new HashSet<>();
        for (int s : B)
            set.add(s);

        for (int i = 0; i < A.length - 1; i++)
            for (int j = i + 1; j < A.length; j++)
                if (set.contains(A[i] + A[j]))
                    return true;
        return false;
    }
}
