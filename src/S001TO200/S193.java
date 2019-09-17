package S001TO200;

import java.util.Stack;

public class S193 {
    public int longestValidParentheses(String s) {

        if (s == null) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        int maxLen = 0;
        int accumulatedLen = 0;

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {   //如果栈为空，没有左括号可以匹配
                    accumulatedLen = 0;
                } else {
                    int matchedPos = stack.pop(); //从最近的'('作为起点
                    int matchedLen = i - matchedPos + 1;    //计算两括号间的长度

                    if (stack.isEmpty()) {			//如果栈为空，没有左括号可以匹配
                        accumulatedLen += matchedLen;
                        matchedLen = accumulatedLen;	//更新当前匹配括号序列长度
                    } else {
                        matchedLen = i - stack.peek();
                    }

                    maxLen = Math.max(maxLen, matchedLen);
                }
            }
        }
        return maxLen;
    }
}
