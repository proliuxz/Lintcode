package S001TO200;

public class S013 {
    public int strStr(String source, String target) {
        // Write your code here
        if(target == "")
            return -1;
        int i = 0;
        int j = 0;
        int sl = source.length();
        int pl = target.length();
        if(pl == 0)
            return 0;

        int[] next = new int[pl];

        getNext(target, next);

        while (i < sl && j < pl) {

            if (source.charAt(i) == target.charAt(j)) {
                i++;
                j++;
            } else {
                if (next[j] == -1) {
                    i++;
                    j = 0;
                } else {
                    j = next[j];
                }

            }

            if (j == pl) {
                return i - j;
            }
        }
        return -1;
    }

    private void getNext(String pattern, int next[]) {
        int j = 0;
        int k = -1;
        int len = pattern.length();
        next[0] = -1;

        while (j < len - 1) {
            if (k == -1 || pattern.charAt(k) == pattern.charAt(j)) {

                j++;
                k++;
                next[j] = k;
            } else {

                k = next[k];
            }
        }
    }
}
