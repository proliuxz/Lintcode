package S401TO600;

public class S478 {
    public int calculate(int a, char operator, int b) {
        // write your code here
        switch (operator){
            case '+': { return a + b; }
            case '-': { return a - b; }
            case '*': { return a * b; }
            case '/': {
                if (b == 0)
                    return 0;
                return a / b; }
        }
        return 0;
    }
}
