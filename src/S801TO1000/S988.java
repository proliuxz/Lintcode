package S801TO1000;

public class S988 {
    public int arrangeCoins(int n) {
        return (int) Math.floor((Math.sqrt(1 + 8 * (long)n) - 1) / 2);
    }
}
