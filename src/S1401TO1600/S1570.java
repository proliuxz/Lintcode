package S1401TO1600;

public class S1570 {
    public int[] getOutput(String s) {
        // Write your code here
        int i, j, tmp = 0, len = s.length(), cnt = 0;
        int[] arr = new int[200005];
        for (i = 0; i < len; i++) {
            tmp *= 2;
            tmp += Integer.valueOf(s.charAt(i));
            tmp %= 3;
            if (tmp == 0)
                arr[cnt++] = i + 1;
        }

        int[] res = new int[cnt];
        for (i = 0; i < cnt; i++)
            res[i] = arr[i];
        return res;
    }
}
