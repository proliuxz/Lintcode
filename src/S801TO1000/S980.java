package S801TO1000;


public class S980 {
    public int calculate(String s) {
        int len = s.length();
        char sign = '+';
        int pre = 0;
        int res = 0;
        int num = 0;
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            boolean isDigit = Character.isDigit(ch);
            if (isDigit) {
                num = num * 10 + (ch - '0');
            }

            if ((!isDigit && ch != ' ') || i == len - 1) {
                switch (sign) {
                    case '+': {
                        res += pre;
                        pre = num;
                        break;
                    }
                    case '-': {
                        res += pre;
                        pre = -num;
                        break;
                    }
                    case '/': {
                        pre = pre / num;
                        break;
                    }
                    case '*': {
                        pre = pre * num;
                        break;
                    }
                }
                num = 0;
                sign = ch;
            }
        }
        return pre + res;
    }
}
