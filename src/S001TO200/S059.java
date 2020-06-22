package S001TO200;

import java.util.Arrays;

public class S059 {
    public int threeSumClosest(int[] numbers, int target) {
        if (numbers == null || numbers.length < 3)
            return 0;
        Arrays.sort(numbers);
        int res = numbers[0] + numbers[1] + numbers[2];
        int dis = Math.abs(res - target);
        for (int i = 0; i < numbers.length - 2; i++) {
            int j = i + 1;
            int k = numbers.length - 1;
            while (j < k)
            {
                int sum = numbers[i] + numbers[j] + numbers[k];
                int distance = Math.abs(sum - target);
                if (distance < dis)
                {
                    dis = distance;
                    res = sum;
                }
                if (sum < target)
                    j++;
                else if (sum > target)
                    k--;
                else
                    return sum;
            }
        }
        return res;
    }
}
