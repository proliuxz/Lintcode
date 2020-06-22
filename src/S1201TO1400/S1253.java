package S1201TO1400;

import java.util.Stack;

public class S1253 {
    public String toHex(int num) {
        if (num == 0)
            return "0";
        Stack<Character> stack = new Stack<>();
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        int count = 0;
        while (num != 0 && count < 8) {
            int i = num & 0xf;
            stack.push(hex[i]);
            num = num >> 4;
            count++;
        }
        String s = "";
        while (!stack.isEmpty())
            s += stack.pop();
        return s;
    }
}
