package S201TO400;

public class S238 {
    public void drawHorizontalLine(byte[] screen, int width, int x1, int x2, int y) {
        // Write your code here
        int h = screen.length * 8 / 16;
        int g = width / 8;
        int s = y * g;
        int e = s + g - 1;
    }

    public byte change(byte ori, int num, int width, int x1, int x2)
    {
        return 0;
    }
}
