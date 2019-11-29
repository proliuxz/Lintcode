package S601TO800;

import java.util.HashMap;
import java.util.Map;

public class S607 {
    private Map<Integer, Boolean> nums;
    public S607() {
        nums = new HashMap<>();
    }
    public void add(int number) {
        // write your code here
        if (nums.containsKey(number))
            nums.put(number, true);
        else
            nums.put(number, false);
    }

    /**
     * @param value: An integer
     * @return: Find if there exists any pair of numbers which sum is equal to the value.
     */
    public boolean find(int value) {
        // write your code here
        for (int num1: nums.keySet()
             ) {
            int num2 = value - num1;
            if (num1 == num2)
            {
                if (nums.get(num1))
                    return true;
            }
            else if (nums.containsKey(num2))
                return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        S607 s = new S607();
        s.add(2);
        s.add(3);
        System.out.println(s.find(4));
        System.out.println(s.find(5));
        System.out.println(s.find(6));
        s.add(3);
        System.out.println(s.find(6));
    }
}

