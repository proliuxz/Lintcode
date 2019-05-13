package S001TO200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S057 {
    public List<List<Integer>> threeSum(int[] numbers) {
        // write your code here
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(numbers);
        int left = 0;
        int mid = 1;
        int right = numbers.length - 1;
        for (left = 0; left <= numbers.length - 3; left++)
        {
            if (left != 0 && numbers[left] == numbers[left - 1])
                continue;
            mid = left + 1;
            right = numbers.length - 1;
            while (mid < right)
            {
                if (numbers[left] + numbers[mid] + numbers[right] == 0)
                {
                    List<Integer> tempResult = new ArrayList<Integer>();
                    tempResult.add(numbers[left]);
                    tempResult.add(numbers[mid]);
                    tempResult.add(numbers[right]);
                    result.add(tempResult);
                    mid++;
                    right--;
                    while (mid < right && numbers[mid] == numbers[mid - 1])
                    {
                        mid++;
                    }
                    while (mid < right && numbers[right] == numbers[right + 1])
                    {
                        right--;
                    }
                } else if (numbers[left] + numbers[mid] + numbers[right] > 0)
                {
                    right--;
                } else if (numbers[left] + numbers[mid] + numbers[right] < 0)
                {
                    mid++;
                }
            }
        }
        return result;
    }
}
