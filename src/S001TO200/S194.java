package S001TO200;

import java.util.List;
import java.util.stream.Collectors;

public class S194 {
    public List<String> findWords(String str, List<String> dict) {
        return dict.stream().filter(d -> isSubsequence(str, d)).collect(Collectors.toList());
    }

    private boolean isSubsequence(String source, String target) {
        if (target.length() > source.length())
            return false;

        int sIdx = 0;
        int tIdx = 0;
        while (tIdx < target.length() && sIdx < source.length()) {
            if (source.charAt(sIdx) == target.charAt(tIdx))
                tIdx++;
            sIdx++;
        }
        return tIdx == target.length();
    }
}
