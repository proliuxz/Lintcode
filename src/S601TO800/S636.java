package S601TO800;

import java.util.Stack;

public class S636 {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int sec = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < sec)
                return true;
            while (!stack.empty() && nums[i] > stack.peek())
                sec = stack.pop();
            stack.push(nums[i]);
        }
        return false;
    }
}
