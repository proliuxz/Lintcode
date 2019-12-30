package S401TO600;

import java.util.Stack;

public class S575 {
    Stack<Integer> cnt;
    Stack<Character> characters;
    public String expressionExpand(String s) {
        if (s == null || s.length() == 1) {
            return s;
        }
        Stack<Integer> cnt = new Stack<>();
        Stack<String> strings = new Stack<>();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                strings.push(sb.toString());
                sb = new StringBuilder();
                int numberIndex = s.indexOf('[', i);
                int num = Integer.valueOf(s.substring(i, numberIndex));
                cnt.push(num);
                i = numberIndex + 1;
            } else if (c == ']') {
                int num = cnt.pop();
                StringBuilder temp = new StringBuilder(strings.pop());
                for (int j = 0; j < num; j++)
                    temp.append(sb);
                sb = temp;
                i++;
            } else {
                sb.append(c);
                i++;
            }
        }
        return sb.toString();
    }
}
