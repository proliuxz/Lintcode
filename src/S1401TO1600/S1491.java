package S1401TO1600;

import java.util.Stack;

public class S1491 {
    public int scoreOfParentheses(String S) {
        // Write your code here
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < S.length()) {
            while (S.charAt(i) == '(') {
                stack.push(-1);
                i++;
            }
            while (i < S.length() && S.charAt(i) == ')') {
                int k = 0;
                while (stack.peek() != -1) {
                    k += stack.pop();
                }
                stack.pop();
                if (k == 0) {
                    stack.push(1);
                }
                else {
                    stack.push(k * 2);
                }
                i++;
            }
        }
        int ans = 0;
        while (!stack.empty()) {
            ans += stack.pop();
        }
        return ans;
    }
}
