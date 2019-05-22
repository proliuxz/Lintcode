package S401TO600;

import Util.InterfaceQueue;

import java.util.ArrayList;
import java.util.List;

public class S546 implements InterfaceQueue {
    List<Integer> numbers;
    S546(){
        numbers = new ArrayList<>();
    }
    @Override
    public void push(int val) {
        numbers.add(val);
    }

    @Override
    public int pop() {
        int res = numbers.get(0);
        numbers.remove(res);
        return res;
    }

    @Override
    public int top() {
        return numbers.get(numbers.size() - 1);
    }
}
