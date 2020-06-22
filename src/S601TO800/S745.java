package S601TO800;

public class S745 {
    public int PalindromicRanges(int L, int R) {
        if(R < L)
            return 0;
        if(R == L)
            return 1;

        int [] dp = new int[R - L + 2];
        for(int i = L; i <= R; i++) {
            dp[i - L + 1] = dp[i - L];
            if(isPalindrome(i))
                dp[i - L + 1]++;
        }

        int count = 0;
        int len = R - L + 2;
        for(int i = 1; i < len; i++)
            for(int j = i - 1; j >= 0; j--)
                if((dp[i] - dp[j]) % 2 == 0)
                    count++;

        return count;
    }

    private boolean isPalindrome(int x)
    {
        if (x < 0)
            return false;
        int div = 1;
        while (x / div >= 10)
            div *= 10;
        while (x != 0) {
            int l = x / div;
            int r = x % 10;
            if (l != r)
                return false;
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
}
