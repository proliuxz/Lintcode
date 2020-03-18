package S1801TO2000;

import java.util.stream.IntStream;

public class S1851 {
    public int buyPasses(int[] arr, int k) {
        return IntStream.range(0, arr.length).map(i -> Math.min(arr[i], i <= k ? arr[k] : arr[k] - 1)).sum();
    }
}
