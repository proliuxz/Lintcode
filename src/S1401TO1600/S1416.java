package S1401TO1600;

public class S1416 {
    public int[] getPreviousNumber(int[] num) {
        int[] stack = new int[num.length];
        int[] res = new int[num.length];
        int top = -1;
        for (int i = 0; i < num.length; i++) {
            while (top != -1 && num[i] <= stack[top])
                top--;
            stack[++top] = num[i];
            if (top > 0)
                res[i] = stack[top - 1];
            else
                res[i] = num[i];
        }
        return res;
    }
}
