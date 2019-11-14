package S601TO800;

public class S759 {
    public float timeAngle(int h, int m) {
        // write your code here
        h = h % 12;
        float hh = (float)(h * 30 + 0.5 * m);
        float mm = m * 6;
        float res = Math.abs(mm - hh);
        return res > 180 ? 360 - res : res;
    }
}
