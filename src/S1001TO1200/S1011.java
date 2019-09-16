package S1001TO1200;

public class S1011 {
    public int[] numberOfLines(int[] widths, String S) {
        // Write your code here
        int line = 0;
        int width = 0;
        for (char c: S.toCharArray()
             ) {
            int w = widths[c-'a'];
            width += w;
            if (width > 100)
            {
                width = w;
                line++;
            }
        }
        if (width != 0)
            line++;
        return new int[] {line, width};
    }
}
