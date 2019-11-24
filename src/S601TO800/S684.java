package S601TO800;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S684 {
    public List<String> missingString(String str1, String str2) {
        // Write your code here
        List<String> res = new ArrayList<>();
        Set<String> set = new HashSet<>();
        String[] arr2 = str2.split(" ");
        for (String a: arr2
             ) {
            set.add(a);
        }
        String[] arr1 = str1.split(" ");
        for (String b: arr1
             ) {
            if (!set.contains(b))
                res.add(b);
        }
        return res;
    }
}
