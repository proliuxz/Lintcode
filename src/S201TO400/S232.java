package S201TO400;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class S232 {
    Map<String, String> toLong = new HashMap<>();
    Map<String, String> toShort = new HashMap<>();
    public String longToShort(String url) {
        boolean exist = true;
        String s = new String();
        while (exist)
        {
            s = getShortRandomUrl(url);
            exist = toLong.containsKey(s);
        }
        toLong.put(s, url);
        toShort.put(url,s);
        return "http://tiny.url/" + s;
    }

    public String shortToLong(String url) {
        return toLong.get(url.substring(16));
    }

    private String getShortRandomUrl(String s)
    {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 6;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }
}
