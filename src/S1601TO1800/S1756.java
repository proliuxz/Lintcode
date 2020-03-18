package S1601TO1800;

public class S1756 {
    public int buyBeverage(int budget, int cost, int exchange) {
        int res = budget / cost;
        int point = res;
        while (point >= exchange)
        {
            int x = point / exchange;
            res += x;
            point = point % exchange + x;
        }
        return res;
    }
}
