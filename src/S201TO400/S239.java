package S201TO400;

public class S239 {
    public double[] rootOfEquation(double a, double b, double c) {
        // write your code here
        double delta = b * b - 4 * a * c;
        if (delta < 0)
            return new double[0];
        else if (delta == 0)
            return new double[] { (-b) / 2 / a };
        else {
            double d = Math.sqrt(delta);
            double res1 = (-b - d) / 2 / a;
            double res2 = (-b + d) / 2 / a;
            if (res1 > res2)
                return new double[] { res2, res1 };
            else
                return new double[] { res1, res2 };
        }
    }
}
