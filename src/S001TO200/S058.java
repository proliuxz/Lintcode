package S001TO200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S058 {
    public List<List<Integer>> fourSum(int[] numbers, int target) {
        // write your code here
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 3; i++) {
            if (i != 0 && numbers[i] == numbers[i - 1])
                continue;

            for (int j = i + 1; j < numbers.length - 2; j++) {
                if (j != i + 1 && numbers[j] == numbers[j - 1])
                    continue;

                int k = j + 1;
                int l = numbers.length - 1;
                while (k < l) {
                    int sum = numbers[i] + numbers[j] + numbers[k] + numbers[l];
                    if (sum < target)
                        k++;
                    else if (sum > target)
                        l--;
                    else {
                        ArrayList<Integer> tmp = new ArrayList<>();
                        tmp.add(numbers[i]);
                        tmp.add(numbers[j]);
                        tmp.add(numbers[k]);
                        tmp.add(numbers[l]);
                        res.add(tmp);
                        k++;
                        l--;

                        while (k < l && numbers[k] == numbers[k - 1])
                            k++;

                        while (k < l && numbers[l] == numbers[l + 1])
                            l--;
                    }
                }
            }
        }
        return res;
    }
}
