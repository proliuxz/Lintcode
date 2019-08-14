package S801TO1000;

public class S987 {
    public boolean hasAlternatingBits(int n) {
        n = n ^ (n>>1);
        return (n & n+1) == 0;
    }
}
