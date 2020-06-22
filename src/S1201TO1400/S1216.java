package S1201TO1400;

public class S1216 {
    public int largestPalindrome(int n) {
        if (n == 1)
            return 9;

        int upperBound = (int) Math.pow(10, n) - 1;
        int lowerBound = upperBound / 10;
        long maxNumber = (long) upperBound * (long) upperBound;

        int firstHalf = (int) (maxNumber / (long) Math.pow(10, n));

        boolean palindromeFound = false;
        long palindrome = 0;

        while (!palindromeFound) {
            palindrome = createPalindrome(firstHalf);
            for (long i = upperBound; upperBound > lowerBound; i--) {
                if (palindrome / i > maxNumber || i * i < palindrome)
                    break;
                if (palindrome % i == 0) {
                    palindromeFound = true;
                    break;
                }
            }
            firstHalf--;
        }
        return (int) (palindrome % 1337);
    }

    private long createPalindrome(long num) {
        String str = num + new StringBuilder().append(num).reverse().toString();
        return Long.parseLong(str);
    }
}
