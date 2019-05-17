package S401TO600;

import java.util.ArrayList;
import java.util.List;

public class S495 {
    List<Integer> list = new ArrayList<>();
    public void push(int x) {
        list.add(x);
    }

    public void pop() {
        int len = list.size();
        list.remove(len - 1);
    }

    public int top() {
        int len = list.size();
        return list.get(len - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args)
    {
        S495 s = new S495();
        s.push(1);
        s.push(2);
        s.pop();
        s.top();

    }
}
