package S1201TO1400;

public class S1209 {
    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        while (area % w != 0)
            w--;
        return new int[]{area / w, w};
    }
}
