import java.util.HashMap;

public class S608 {
    public int[] twoSum(int[] nums, int target) {
        // write your code here
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            numbers.put(nums[i], i);
        }

        for (int i = 0; i < nums.length ; i++) {
            int key = target - nums[i];
            if (numbers.containsKey(key))
            {
                int val = numbers.get(key);
                if ( val != nums[i])
                {
                    if (val < i)
                        return new int[] {val + 1 , i + 1};
                    else
                        return new int[] {i + 1, val + 1};
                }
            }
        }
        return null;
    }

    public static void main(String[] args)
    {
        S608 s = new S608();
        int[] nums = new int[] {2,7,11,15};
        int target = 9;
        int[] res = s.twoSum(nums, target);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
