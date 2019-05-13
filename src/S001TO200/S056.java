package S001TO200;

import java.util.HashMap;

public class S056 {
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i]))
            {
                int num = map.get(target - numbers[i]);
                if (num != i)
                    return new int[] { i, num };
            }
        }
        return null;
    }
}
