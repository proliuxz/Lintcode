package S001TO200;

import Util.NestedInteger;

import java.util.ArrayList;
import java.util.List;

public class S022 {
    public List<Integer> flatten(List<NestedInteger> nestedList) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for (NestedInteger n: nestedList
             ) {
            if (n.isInteger())
            {
                result.add(n.getInteger());
            }
            else {
                result.addAll(flatten(n.getList()));
            }
        }
        return result;
    }
}
