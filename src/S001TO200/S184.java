package S001TO200;

import java.util.*;

public class S184 {
    public String largestNumber(int[] nums) {
        if (nums==null || nums.length==0)
            return null;
        List<Integer> numList = new ArrayList<Integer>();
        for (int num: nums) {
            numList.add(num);
        }

        Collections.sort(numList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1.toString();
                String s2 = o2.toString();
                return (s2+s1).compareTo(s1+s2);
            }
        });

        boolean start = true;
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < numList.size() ; i++) {
            int n = numList.get(i);
            if (start) {
                if (n != 0 || i == numList.size()-1) {
                    sb.append(n);
                    start = false;
                }
            }
            else {
                sb.append(n);
            }
        }
        return sb.toString();
    }
}
