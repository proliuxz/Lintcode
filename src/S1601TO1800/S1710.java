package S1601TO1800;

public class S1710 {
    public int[] beautifulArray(int N) {
        int res[] = new int[N];

        for (int i = 0; i < res.length; i++) {
            int index = 0;
            int off = N;
            for (int n = i; n > 0; n >>= 1) {
                int obit = (off & 1);
                off = (off + 1) / 2;
                if ((n & 1) != 0) {
                    index += off;
                    off -= obit;
                }
            }
            res[index] = i + 1;
        }
        return res;
    }
}
