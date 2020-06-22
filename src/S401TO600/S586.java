package S401TO600;

public class S586 {
    public double sqrt(double x) {
        double k = 1.0;
        while (Math.abs(k * k - x) > 1e-9) {
            k = (k + x / k) / 2;
        }
        return k;
    }
}
