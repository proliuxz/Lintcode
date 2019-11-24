package S801TO1000;
import Util.Point;

public class S957 {
    public String radarDetection(Point[] coordinates, int[] radius) {
        // Write your code here
        for (int i = 0; i < coordinates.length; i++) {
            int h = coordinates[i].y + radius[i];
            int l = coordinates[i].y - radius[i];
            if (h <= 1 && l >= 0)
                return "NO";
        }
        return "YES";
    }

    public static void main(String[] args)
    {
        S957 s = new S957();
        Util.Point[] points = new Point[] { new Point(0,2) };
        s.radarDetection(points, new int[]{1});
    }
}
