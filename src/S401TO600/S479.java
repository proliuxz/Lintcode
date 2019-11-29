package S401TO600;

public class S479 {
    public int secondMax(int[] nums) {
        // write your code here
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int num: nums
             ) {
            if (num >= max)
            {
                secMax = max;
                max = num;
            }
            else if (num >= secMax)
                secMax = num;
        }
        return secMax;
    }
}
