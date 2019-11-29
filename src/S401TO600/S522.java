package S401TO600;

import java.util.HashMap;
import java.util.Random;

public class S522 {
    private String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private StringBuffer tinyUrl = new StringBuffer("http://tiny.url/");
    HashMap<String, String> s2l = new HashMap<>();
    HashMap<String, String> l2s = new HashMap<>();
    Random rand = new Random();
    int length = 6;

    public String getRand() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(alphabet.charAt(rand.nextInt(62)));
        }
        return tinyUrl + sb.toString();
    }
    public String createCustom(String long_url, String key) {
        // write your code here
        String short_url = tinyUrl + key;
        if (l2s.containsKey(long_url)) {
            if (l2s.get(long_url).equals(short_url))
                return short_url;
            else
                return "error";
        }
        if (s2l.containsKey(short_url))
            return "error";
        l2s.put(long_url, short_url);
        s2l.put(short_url, long_url);
        return short_url;
    }

    /*
     * @param long_url: a long url
     * @return: a short url starts with http://tiny.url/
     */
    public String longToShort(String long_url) {
        // write your code here
        if (l2s.containsKey(long_url))
            return l2s.get(long_url);
        String short_url = getRand();
        l2s.put(long_url, short_url);
        s2l.put(short_url, long_url);
        return short_url;
    }

    /*
     * @param short_url: a short url starts with http://tiny.url/
     * @return: a long url
     */
    public String shortToLong(String short_url) {
        // write your code here
        if (s2l.containsKey(short_url))
            return s2l.get(short_url);
        return "error";
    }
}
