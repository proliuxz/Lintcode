package S1601TO1800;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class S1713 {
    public int numUniqueEmails(String[] emails) {
        // write your code here
        Set<String> different = new HashSet<>();
        Arrays.stream(emails).forEach((String e) -> {
            String[] parts = e.split("@");
            String[] local = parts[0].split("\\+");
            different.add(local[0].replace(".", "") + "@" + parts[1]);
        });
        return different.size();
    }
}
