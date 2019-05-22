package S201TO400;

public class S236 {
    public int swapOddEvenBits(int x) {
        // Write your code here
        return ( ((x & 0xaaaaaaaa) >>> 1) | ((x & 0x55555555) << 1) );
    }
}
