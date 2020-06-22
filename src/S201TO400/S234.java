package S201TO400;

import java.util.*;



public class S234 {
    static class HtmlHelper{
        static List<String> parseUrls(String s) { return null; }
    }
    public List<String> crawler(String url) {
        Set<String> sets = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer(url);
        while (!q.isEmpty())
        {
            String s = q.poll();
            sets.add(s);
            List<String> urls = HtmlHelper.parseUrls(s);
            for (String u: urls
                 ) {
                if (!sets.contains(u) && u.contains("wikipedia"))
                    q.add(u);
            }
        }
        return new ArrayList<>(sets);
    }
}
