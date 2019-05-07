import java.util.*;

public class S016 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        // write your code here
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0)
        {
            result.add(new ArrayList<>());
            return result;
        }
        for (int num : nums) {
            if (result.size() == 0) {
                result.add(new ArrayList<>(Arrays.asList(num)));
            } else {
                // hash set: used to keep unique lists
                Set<List<Integer>> newResult = new HashSet<>();
                for (List<Integer> list : result) {
                    for (int i = 0; i <= list.size(); i++) {
                        ArrayList<Integer> newList = new ArrayList<>(list);
                        newList.add(i, num);
                        newResult.add(newList);
                    }
                }
                result = new ArrayList<>(newResult);
            }
        }
        return result;
    }
}
