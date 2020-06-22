package S401TO600;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S523 {
    public List<String> parseUrls(String content) {
        // write your code here
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("href[\\s]*=[\\s]*[\"|']([^\"'>\\s]*)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            String res = matcher.group(1);
            if (!res.startsWith("#") && res.length() != 0)
                result.add(matcher.group(1));
        }
        return result;
    }
}
