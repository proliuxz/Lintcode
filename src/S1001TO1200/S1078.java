package S1001TO1200;

import java.util.*;

public class S1078 {
    class NodeWithDistance {
        int count;
        int start;
        int end;
        NodeWithDistance(int pos) {
            count = 1;
            start = pos;
            end = pos;
        }
        public void addPos(int pos) {
            count++;
            if (pos<start)
                start = pos;
            if (pos>end)
                end = pos;
        }
    }

    public int findShortestSubArray(int[] nums) {
        if (nums==null||nums.length==0)
            return 0;
        Map<Integer, NodeWithDistance> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            int num = nums[i];
            if(map.containsKey(num))
            {
                NodeWithDistance node = map.get(num);
                node.addPos(i);
            } else
                map.put(num,new NodeWithDistance(i));
        }

        TreeSet<NodeWithDistance> set = new TreeSet<>((o1, o2)->o1.count == o2.count ? (o1.end - o1.start) - (o2.end - o2.start) : o2.count-o1.count);
        for (int key: map.keySet())
            set.add(map.get(key));
        NodeWithDistance node = set.first();
        return node.end - node.start + 1;
    }
}
