package S1401TO1600;

import java.util.HashSet;
import java.util.Set;

public class S1471 {
    public int[] getAnswer(int[] A, int[] B) {
        // Write your code here
        Set<Integer> set = new HashSet<>();
        for (int a: A
             ) {
            set.add(a);
        }
        int u = 0;
        for (int b: B
             ) {
            if (set.contains(b))
                u++;
        }
        return new int[] {A.length + B.length - u, u, A.length - u};
    }
}
