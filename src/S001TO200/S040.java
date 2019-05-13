package S001TO200;

import java.util.Stack;

public class S040 {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public S040() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public void transfer()
    {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
    }

    public void push(int element) {
        // write your code here
        s1.push(element);
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
        if(s2.empty()){
            transfer();
        }
        return s2.pop();
    }

    /*
     * @return: An integer
     */
    public int top() {
        // write your code here
        if(s2.empty()){
            transfer();
        }
        return s2.peek();
    }
}
