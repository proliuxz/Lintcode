package S001TO200;

import java.util.ArrayList;
import java.util.List;

public class S147 {
    public List<Integer> getNarcissisticNumbers(int n) {
        // write your code here
        List<Integer> result = new ArrayList();
        if (n == 0)
            return result;
        if (n == 1) {
            for (int i = 0; i < 10; ++i)
                result.add(i);
            return result;
        }
        for (double i = Math.pow(10, n-1); i < Math.pow(10, n); ++i)
        {
            if(isNarcissisticNumbers((int) i, n))
                result.add((int) i);
        }
        return result;
    }

    private boolean isNarcissisticNumbers(int num, int pow)
    {
        int res = 0;
        int op = num;
        while (op > 0)
        {
            int tmp = (op % 10);
            op /= 10;
            res += Math.pow(tmp, pow);
        }
        return res == num;
    }

    public static void main(String[] args)
    {
        S147 s = new S147();
        List<Integer> res = s.getNarcissisticNumbers(1);
        System.out.println(res);
    }
}
