package S1801TO2000;

public class S1881 {
    public int solution(int N, String S) {
        int res = 0;
        boolean[][] arr = buildArr(N, S);
        for (boolean[] a: arr)
            res += searchLine(a);
        return res;
    }

    private boolean[][] buildArr(int N, String S)
    {
        boolean[][] arr = new boolean[N][10];
        String[] ocp = S.split(" ");
        for (String str: ocp)
            if (!str.isEmpty())
            {
                int len = str.length();
                arr[Integer.valueOf(str.substring(0, len - 1)) - 1][str.charAt(len - 1) - 'A'] = true;
            }
        return arr;
    }

    private int searchLine(boolean[] arr)
    {
        boolean b2e = true;
        boolean f2j = true;
        boolean d2g = true;
        if (arr[1] == true || arr[2] == true)
            b2e =false;
        if (arr[3] == true || arr[4] == true)
        {
            b2e = false;
            d2g = false;
        }
        if (arr[5] == true || arr[6] == true)
        {
            d2g = false;
            f2j = false;
        }
        if (arr[7] == true || arr[8] == true)
            f2j = false;
        if (b2e && f2j)
            return 2;
        if (b2e || f2j || d2g)
            return 1;
        return 0;
    }
}
