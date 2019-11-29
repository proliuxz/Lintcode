package S401TO600;

import Util.NestedInteger;

import java.util.List;

public class S551 {
    public int depthSum(List<NestedInteger> nestedList) {
        // Write your code here
        if(nestedList == null || nestedList.size() == 0)
            return 0;
        return helper(nestedList, 1);
    }

    private int helper(List<NestedInteger> nestedList, int priority)
    {
        if(nestedList == null || nestedList.size() == 0)
            return 0;
        int sum = 0;
        for (NestedInteger node: nestedList
        ) {
            sum += node.isInteger() ? node.getInteger() * priority : helper(node.getList(), priority + 1);
        }
        return sum;
    }
}
