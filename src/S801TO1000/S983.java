package S801TO1000;

import java.util.Iterator;
import java.util.Stack;

public class S983 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            String op = ops[i];
            switch (op) {
                case "+": {
                    int s1 = stack.pop();
                    int s2 = stack.pop();
                    int s3 = s1 + s2;
                    stack.push(s2);
                    stack.push(s1);
                    stack.push(s3);
                    break;
                }
                case "D": {
                    int s1 = stack.peek();
                    int s2 = 2*s1;
                    stack.push(s2);
                    break;
                }
                case "C": {
                    stack.pop();
                    break;
                }
                default:
                    stack.push(Integer.valueOf(op));
            }
        }
        int res = 0;
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext())
        {
            res += iterator.next();
        }
        return res;
    }

    public static void main(String[] args)
    {
        String[] ops = new String[]{"5", "2", "C", "D", "+"};
        new S983().calPoints(ops);
    }
}
