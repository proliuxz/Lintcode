package S1201TO1400;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class S1236 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        IntStream.range(0, n).forEach(i -> nums[(nums[i] - 1) % n] += n);
        return IntStream.range(0, n).filter(i -> nums[i] <= n).mapToObj(i -> i + 1).collect(Collectors.toList());
    }

    public static void main(String[] args)
    {
        S1236 s = new S1236();
        int[] nums = new int[]{4,3,2,7,8,3,2,1};
        System.out.println(s.findDisappearedNumbers(nums).toString());
    }
}
