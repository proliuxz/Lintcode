package S001TO200;

public class S008 {
    public void rotateString(char[] str, int offset) {
        // write your code here
        if (str == null || str.length == 0) {
            return;
        }

        int len = str.length;
        offset %= len;

        reverse(str, 0, len - offset - 1);
        reverse(str, len - offset, len - 1);
        reverse(str, 0, len - 1);
    }

    private void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}
