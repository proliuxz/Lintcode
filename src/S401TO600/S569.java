package S401TO600;

public class S569 {
    public int addDigits(int num) {
        // write your code here
        if(num < 10)
            return num;
        int sum = 0;
        while (num > 1)
        {
            sum += num % 10;
            num /= 10;
        }
        return addDigits(sum);
    }
}
