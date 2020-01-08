package S801TO1000;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class S813 {
    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>();
        IntStream.range(0, B.length).forEach(i -> map.put(B[i],i));
        return IntStream.range(0, A.length).map(i -> map.get(A[i])).toArray();
    }
}
