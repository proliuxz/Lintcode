package S1401TO1600;

public class S1503 {
    public int giveChange(int amount) {
        amount = 1024 - amount;
        int res = 0;
        int c = 64;
        while (amount > 0)
        {
            res += amount / c;
            amount %= c;
            c /= 4;
        }
        return res;
    }
}
