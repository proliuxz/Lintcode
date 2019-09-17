package S1201TO1400;

public class S1333 {
    public long reverseBits(long n) {
        // write your code here
        long reversed = 0;
        for (int i = 0; i < 32; i++) {
            reversed = (reversed << 1) | (n & 1);
            n = (n >> 1);
        }
        return reversed;
    }
}
