package S401TO600;

import Util.NestedInteger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class S528 implements Iterator<Integer> {
    List<Integer> list;
    int cur;
    public S528(List<NestedInteger> nestedList) {
        // Initialize your data structure here.
        list = new ArrayList<>();
        cur = 0;
        unnest(nestedList, list);
    }

    private void unnest(List<NestedInteger> nestedList, List<Integer> res) {
        if (nestedList.size() == 0) return;
        for (NestedInteger n : nestedList) {
            if (n.isInteger()) {
                res.add(n.getInteger());
            } else {
                unnest(n.getList(), res);
            }
        }
    }

    // @return {int} the next element in the iteration
    @Override
    public Integer next() {
        // Write your code here
        return list.get(cur++);
    }

    // @return {boolean} true if the iteration has more element or false
    @Override
    public boolean hasNext() {
        // Write your code here
        return cur < list.size();
    }

    @Override
    public void remove() {}
}
