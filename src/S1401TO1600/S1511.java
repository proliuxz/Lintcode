package S1401TO1600;

public class S1511 {
    public int mirrorReflection(int p, int q) {
        // Write your code here
        int k = 1;
        while (q * k % p != 0)
            k++;
        if (q * k / p % 2 != 0)
            return k % 2 == 0 ? 2 : 1;
        return k % 2 ==0 ? -1 : 0;
    }
}
