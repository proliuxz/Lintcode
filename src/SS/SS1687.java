package SS;

public class SS1687 {
    public long getTotalSchemes(int n) {
        // Write your code here.
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        long[] result = new long[n];
        result[0]=1;
        result[1]=2;
        for(int i=2; i<n;i++)
            result[i] = result[i-1] + result[i-2];
        return result[n-1];
    }
}
