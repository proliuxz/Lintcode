package S601TO800;

import java.util.ArrayList;
import java.util.List;

public class S779 {
    public List<String> generateAbbreviations(String word) {
        List<String> res = new ArrayList<String>();
        backtrack(res, new StringBuilder(), word, 0, 0);
        return res;
    }

    private void backtrack(List<String> res, StringBuilder builder, String word, int i, int k) {
        int len = builder.length(); // keep the length of builder
        if (i == word.length()) {
            if (k != 0)
                builder.append(k); // append the last k if non zero
            res.add(builder.toString());
        } else {
            // the branch that word.charAt(i) is abbreviated
            backtrack(res, builder, word, i + 1, k + 1);

            // the branch that word.charAt(i) is kept
            if (k != 0)
                builder.append(k);
            builder.append(word.charAt(i));
            backtrack(res, builder, word, i + 1, 0);
        }
        builder.setLength(len); // reset builder to the original state
    }
}
