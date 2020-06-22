package S601TO800;

import java.util.List;

public class S784 {
    public int the_longest_common_prefix(List<String> dic, String target) {
        if (dic == null || dic.size() == 0)
            return 0;
        String prefix = findPrefix(dic.get(0), target);
        for (int i = 1; i < dic.size(); i++) {
            if (dic.get(i).startsWith(prefix))
                prefix = findPrefix(dic.get(i), target);
        }
        return prefix.length();
    }

    private String findPrefix(String str1, String str2)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            if (str1.charAt(i) == str2.charAt(i))
                sb.append(str1.charAt(i));
            else
                return sb.toString();
        }
        return sb.toString();
    }
}
