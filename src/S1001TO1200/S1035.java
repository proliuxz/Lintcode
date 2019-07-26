package S1001TO1200;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class S1035 {
    public int numRabbits(int[] answers) {
        // write your code here
        if(answers == null || answers.length == 0)
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(answers)
                .forEach((int ans) -> map.put(ans, map.getOrDefault(ans, 0) + 1));
        return map.keySet()
                .stream()
                .mapToInt(key -> (int) (Math.ceil((double) map.get(key) / (key + 1)) * (key + 1)))
                .sum();
    }

    public static void main(String[] args)
    {
        S1035 s = new S1035();
        int[] answers = {1,1,2};
        int result = s.numRabbits(answers);
        System.out.println(result);
    }
}
