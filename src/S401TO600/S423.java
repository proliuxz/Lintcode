package S401TO600;

import java.util.Stack;

public class S423 {
    public boolean isValidParentheses(String s) {
        // write your code here
        Stack<Character> stack = new Stack<>();
        for (char c1: s.toCharArray()
             ) {
            if (c1 == '(' || c1 == '[' || c1 == '{')
                stack.push(c1);
            else if (c1 == ')')
            {
                if (stack.isEmpty() || stack.pop() != '(')
                    return false;
            }
            else if (c1 == ']')
            {
                if (stack.isEmpty() || stack.pop() != '[')
                    return false;
            }
            else if (c1 == '}')
            {
                if (stack.isEmpty() || stack.pop() != '{')
                    return false;
            }
            else
                return false;
        }
        return stack.isEmpty();
    }
}
