public class SS1667 {
    public long intervalStatistics(int[] arr, int k) {
        // Write your code here.
        if (arr == null || arr.length == 0)
            return 0;
        int left = 0;
        int right = 0;
        long count = 0;
        long result = 0;
        while (right < arr.length)
        {
            if (arr[right] == 1)
            {
                count++;
                right++;
                continue;
            }

            if (arr[left] == 1)
            {
                count--;
                left++;
                continue;
            }

            while (count > k)
            {
                if (arr[left] == 1)
                {
                    count--;
                }
                left++;
            }

            result += right - left + 1 - count;
            right++;

        }

        return result;
    }
}
