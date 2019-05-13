package S001TO200;

public class S141 {
    public int sqrt(int x) {
        if (x == 0)
            return 0;

        double avg = x;
        double last = Double.MAX_VALUE;

        while (Math.abs(avg - last) > 1) {
            last = avg;
            avg = (avg + x / avg) / 2;
        }
        return (int) avg;
    }
}
