package S801TO1000;

public class S871 {
    public int smallestFactorization(int a) {
        String result = "";
        boolean flag = true;
        while (flag)
        {
            flag = false;
            for (int i = 9; i > 1 ; i--) {
                if (a % i == 0)
                {
                    flag = true;
                    result = i + result;
                    a = a / i;
                    break;
                }
            }
        }

        if (a != 1)
        {
            return 0;
        }
        try{
            return Integer.parseInt(result);
        }
        catch (NumberFormatException ex)
        {
            return 0;
        }
    }

    public static void main(String[] args)
    {
        S871 s871 = new S871();
        System.out.println(s871.smallestFactorization(128));
    }
}
