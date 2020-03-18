package S601TO800;

public class S681 {
    public int firstMissingPrime(int[] nums) {
        if (nums.length == 0 || nums[0] > 2)
            return 2;

        for (int i = 0; i < nums.length - 1; i++) {
            int n = nextPrime(nums[i]);
            if (n != nums[i + 1])
                return n;
        }
        return nextPrime(nums[nums.length - 1]);
    }

    private int nextPrime(int n)
    {
        int x = n + 1;
        while (!isPrime(x))
            x++;
        return x;
    }

    private boolean isPrime(int n) {
        if ( n == 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
