package S601TO800;

public class S662 {
    public int guessNumber(int n) {
        // Write your code here
        int l = 1;
        int r = n;
        while (l <= r)
        {
            int mid = l + r / 2;
            int res = guess(mid);
            if(res == 0)
                return mid;
            if (res == -1)
                r = mid - 1;
            else {
                l = mid + 1;
            }
        }
        return 0;
    }

    private int guess(int num){
        int n = 19;
        if (num == n)
            return 0;
        return num > n ? 1 : -1;
    }
}
