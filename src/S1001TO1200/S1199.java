package S1001TO1200;

public class S1199 {
    public boolean checkPerfectNumber(int num) {
        if (num == 1)
            return true;
        int sum = 0;
        double sqrt = Math.sqrt(num);
        for (int i = 1; i <= sqrt; i++)
            if (num % i == 0)
            {
                sum += i;
                if (i != sqrt && i != 1)
                    sum += num / i;
            }
        return sum == num;
    }
}
