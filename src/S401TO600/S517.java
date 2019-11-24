package S401TO600;

public class S517 {
    public boolean isUgly(int num) {
        // write your code here
        if (num <= 0)
            return false;
        while (num >= 2 && num % 2 ==0)
            num /= 2;
        while (num >= 3 && num % 3 ==0)
            num /= 3;
        while (num >= 5 && num % 5 ==0)
            num /= 5;

        return num == 1;
    }
}
