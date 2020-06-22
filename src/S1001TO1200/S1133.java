package S1001TO1200;

public class S1133 {
    public int groupBuyTimes(int x, int y, int z) {
        return Math.min((x + y + z) / 3, Math.min(x, y));
    }
}
