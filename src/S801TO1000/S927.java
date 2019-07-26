package S801TO1000;

public class S927 {
    public char[] reverseWords(char[] str) {
        // write your code here
        int n = str.length, pre = 0;
        for (int i = 0; i <= n; ++i) {
            if (i == n || str[i] == ' ') {
                swap(str, pre, i - 1);
                pre = i + 1;
            }
        }
        swap(str, 0, n - 1);
        return str;
    }

    private void  swap(char[] str, int l, int r) {
        for (int i = l; i <= (l + r) / 2; ++i) {
            char tmp = str[i];
            str[i] = str[l + r - i];
            str[l + r - i] = tmp;
        }
    }
}
