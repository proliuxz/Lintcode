package S1601TO1800;

import java.util.Arrays;

public class S1788 {
    public int[] AscendingBinarySorting(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .sorted((a, b) -> {
                    int c1 = Integer.bitCount(a);
                    int c2 = Integer.bitCount(b);
                    return c1 == c2 ? a - b : c1 - c2;
                })
                .mapToInt(i -> i)
                .toArray();
    }
}
