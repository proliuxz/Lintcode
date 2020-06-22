package S401TO600;

import Util.Document;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S500 {
    public Map<String, List<Integer>> invertedIndex(List<Document> docs) {
        Map<String, List<Integer>> results = new HashMap<>();
        for (Document doc : docs) {
            int id = doc.id;
            StringBuffer temp = new StringBuffer();
            String content = doc.content;
            int n = content.length();
            for (int i = 0; i < n; ++i) {
                if (content.charAt(i) == ' ') {
                    insert(results, temp.toString(), id);
                    temp = new StringBuffer();
                } else
                    temp.append(content.charAt(i));
            }
            insert(results, temp.toString(), id);
        }
        return results;
    }

    public void insert(Map<String, List<Integer>> rt, String tmp, int id) {
        if (tmp.equals("") || tmp == null)
            return;

        if (!rt.containsKey(tmp))
            rt.put(tmp, new ArrayList<>());

        int n = rt.get(tmp).size();
        if (n == 0 || rt.get(tmp).get(n - 1) != id)
            rt.get(tmp).add(id);
    }
}
