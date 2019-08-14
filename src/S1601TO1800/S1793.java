package S1601TO1800;

public class S1793 {
    public int BalancedSalesArray(int[] sales) {
        // write your code here
        int[] nSum = new int[sales.length];
        nSum[0] = sales[0];
        for (int i = 1; i < nSum.length; i++) {
            nSum[i] = nSum[i - 1] + sales[i];
        }
        for (int i = 1; i < nSum.length - 1; i++) {
            if (nSum[i-1] == (nSum[nSum.length - 1] - nSum[i]))
                return i;
        }
        return 0;
    }
}
