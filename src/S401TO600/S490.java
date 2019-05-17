package S401TO600;

import java.util.ArrayList;
import java.util.Stack;

public class S490 {
    ArrayList<Stack<Integer>> stacks;
    public int capacity;
    public S490(int capacity) {
        this.capacity = capacity;
        stacks  = new ArrayList<>();
    }

    public void push(int v)
    {
        Stack s = getLeastStack();
        if (s.size() < capacity)
            s.add(v);
        else {
            Stack<Integer> newStack = new Stack();
            newStack.push(v);
            stacks.add(newStack);
        }
    }

    public int pop() {
        Stack<Integer> s = getLeastStack();
        int v =  s.pop();
        if (s.size() == 0)
            stacks.remove(s);
        return v;
    }

    private Stack<Integer> getLeastStack()
    {
        if (stacks.size() == 0)
        {
            Stack s = new Stack();
            stacks.add(s);
            return s;
        }
        return stacks.get(stacks.size() - 1);
    }
}
