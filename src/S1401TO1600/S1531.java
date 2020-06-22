package S1401TO1600;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class S1531 {
    public String automaticProofreadingProgram(String str) {
        List<Character> res = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            res.add(str.charAt(i));
            int n = res.size();
            if (n < 3)
                continue;
            if (res.get(n - 1) == res.get(n - 2)) {
                if (n >= 3) {
                    if (res.get(n - 1) == res.get(n - 3)) {
                        res.remove(n - 1);
                        continue;
                    }
                }

                n = res.size();
                if (n >= 4)
                    if (res.get(n - 3) == res.get(n - 4))
                        res.remove(n - 1);
            }
        }
        return res.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
