package S401TO600;

public class S600 {
    public int minArea(char[][] image, int x, int y) {
        int m = image.length, n = image[0].length;
        int left = searchColumns(0, y, 0, m, true,image);
        int right = searchColumns(y + 1, n, 0, m, false, image);
        int top = searchRows(0, x, left, right, true, image);
        int bottom = searchRows(x + 1, m, left, right, false, image);
        return (right - left) * (bottom - top);
    }

    private int searchColumns(int i, int j, int top, int bottom, boolean opt, char[][] image) {
        while (i != j) {
            int k = top, mid = (i + j) / 2;
            while (k < bottom && image[k][mid] == '0') ++k;
            if (k < bottom == opt)
                j = mid;
            else
                i = mid + 1;
        }
        return i;
    }

    private int searchRows(int i, int j, int left, int right, boolean opt, char[][] image) {
        while (i != j) {
            int k = left, mid = (i + j) / 2;
            while (k < right && image[mid][k] == '0') ++k;
            if (k < right == opt)
                j = mid;
            else
                i = mid + 1;
        }
        return i;
    }
}
