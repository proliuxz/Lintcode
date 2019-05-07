import java.util.HashMap;
import java.util.Map;

public class S386 {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        // write your code here
        int result = 0;
        int i=0;
        Map<Character, Integer> map = new HashMap<>();

        for(int j = 0; j < s.length(); j++)
        {
            char c = s.charAt(j);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }

            if(map.size() <= k){
                result = Math.max(result, j - i + 1);
            }else{
                while(map.size() > k){
                    char l = s.charAt(i);
                    int count = map.get(l);
                    if(count == 1){
                        map.remove(l);
                    }else{
                        map.put(l, map.get(l) - 1);
                    }
                    i++;
                }
            }

        }
        return result;
    }
}
