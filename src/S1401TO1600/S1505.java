package S1401TO1600;

public class S1505 {
    public boolean findnNumber(int[] nums, int k) {
        // write your code here
        for (int num: nums)
            if (num == k)
                return true;
        return false;
    }
}
