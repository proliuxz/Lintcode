package S1401TO1600;

import java.util.HashMap;

public class S1472 {
    public String isTwin(String s, String t) {
        // Write your code here
        if (s.length() != t.length())
            return "No";
        HashMap<Character, Integer> odd = new HashMap<>();
        HashMap<Character, Integer> even = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            char x = s.charAt(i);
            if(i % 2 == 0)
                even.put(x, even.getOrDefault(x,0) + 1);
            else
                odd.put(x, odd.getOrDefault(x,0) + 1);
        }

        for (int i = 0; i <t.length() ; i++) {
            char x = t.charAt(i);
            if(i % 2 == 0)
            {
                if (!even.containsKey(x))
                return "No";
                int val = even.get(x);
                if (val == 1)
                    even.remove(x);
                else
                    even.put(x, even.get(x) - 1);
            }
            else
            {
                if (!odd.containsKey(x))
                    return "No";
                int val = odd.get(x);
                if (val == 1)
                    odd.remove(x);
                else
                    odd.put(x, odd.get(x) - 1);
            }
        }

        return odd.isEmpty() && even.isEmpty() ? "Yes" : "No";
    }
}
